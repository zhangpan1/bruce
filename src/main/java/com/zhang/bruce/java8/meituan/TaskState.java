package com.zhang.bruce.java8.meituan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/5 5:24 下午
 */
// 任务状态枚举
@AllArgsConstructor
@Getter
enum TaskState {
    INIT("初始化"),
    ONGOING( "进行中"),
    PAUSED("暂停中"),
    FINISHED("已完成"),
    EXPIRED("已过期")
    ;
    private final String message;
}
// 行为枚举
@AllArgsConstructor
@Getter
enum ActionType {
    START(1, "开始"),
    STOP(2, "暂停"),
    ACHIEVE(3, "完成"),
    EXPIRE(4, "过期")
    ;
    private final int code;
    private final String message;
}
class Task1 {
    private Long taskId;
    // 任务的默认状态为初始化
    private TaskState state = TaskState.INIT;
    // 活动服务
    //private ActivityService activityService;
    // 任务管理器
    //private TaskManager taskManager;
    // 使用条件分支进行任务更新
    public void updateState(ActionType actionType) {
        if (state == TaskState.INIT) {
            if (actionType == ActionType.START) {
                state = TaskState.ONGOING;
            }
        } else if (state == TaskState.ONGOING) {
            if (actionType == ActionType.ACHIEVE) {
                state = TaskState.FINISHED;
                // 任务完成后进对外部服务进行通知
              //  activityService.notifyFinished(taskId);
                //taskManager.release(taskId);
            } else if (actionType == ActionType.STOP) {
                state = TaskState.PAUSED;
            } else if (actionType == ActionType.EXPIRE) {
                state = TaskState.EXPIRED;
            }
        } else if (state == TaskState.PAUSED) {
            if (actionType == ActionType.START) {
                state = TaskState.ONGOING;
            } else if (actionType == ActionType.EXPIRE) {
                state = TaskState.EXPIRED;
            }
        }
    }
}

interface State{
    // 默认实现，不做任何处理
    // 默认实现，不做任何处理
    default void update(Task task, ActionType actionType) {
        // do nothing
    }
}
// 任务初始状态
class TaskInit implements State {
    @Override
    public void update(Task task, ActionType actionType) {
        if  (actionType == ActionType.START) {
            // task.setState(new TaskOngoing());
        }
    }
}

// 任务进行状态
class TaskOngoing implements State {
//    private ActivityService activityService;
//    private TaskManager taskManager;
    @Override
    public void update(Task task, ActionType actionType) {
        if (actionType == ActionType.ACHIEVE) {
            task.setState(new TaskFinished());
            // 通知
//            activityService.notifyFinished(taskId);
//            taskManager.release(taskId);
        } else if (actionType == ActionType.STOP) {
            task.setState(new TaskPaused());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}
// 任务暂停状态
class TaskPaused implements State {
    @Override
    public void update(Task task, ActionType actionType) {
        if (actionType == ActionType.START) {
            task.setState(new TaskOngoing());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}
// 任务完成状态
class TaskFinished implements State {

}
// 任务过期状态
class TaskExpired implements State {

}
@Data
class Task {
    private Long taskId;
    // 初始化为初始态
    private State state = new TaskInit();
    // 更新状态
    public void updateState(ActionType actionType) {
        state.update(this, actionType);
    }
}
