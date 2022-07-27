package com.zhang.bruce.java8.meituan;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 观察者模式
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/5 5:51 下午
 */
class Concreate {
}
// 抽象观察者
interface Observer{
    void response(Long taskId);// 反应
}
// 抽象目标
abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();
    // 增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }
    // 删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    // 通知观察者方法
    public void notifyObserver(Long taskId) {
        for (Observer observer : observers) {
            observer.response(taskId);
        }
    }
}

// 活动观察者
class ActivityObserver implements Observer {
    // private ActivityService activityService;
    @Override
    public void response(Long taskId) {
        //activityService.notifyFinished(taskId);
    }
}
// 任务管理观察者
class TaskManageObserver implements Observer {
    // private TaskManager taskManager;
    @Override
    public void response(Long taskId) {
       // taskManager.release(taskId);
    }
}

// 任务进行状态
class TaskOngoing1 extends Subject implements State {
    @Override
    public void update(Task task, ActionType actionType) {
        if (actionType == ActionType.ACHIEVE) {
            task.setState(new TaskFinished());
            // 通知
            notifyObserver(task.getTaskId());
        } else if (actionType == ActionType.STOP) {
            task.setState(new TaskPaused());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}
// 任务初始状态
class TaskInit1 implements State {
    @Override
    public void update(Task task, ActionType actionType) {
        if  (actionType == ActionType.START) {
            TaskOngoing taskOngoing = new TaskOngoing();
//            taskOngoing.add(new ActivityObserver());
//            taskOngoing.add(new TaskManageObserver());
            task.setState(taskOngoing);
        }
    }
}
