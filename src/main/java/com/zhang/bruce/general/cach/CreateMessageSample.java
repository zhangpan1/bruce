package com.zhang.bruce.general.cach;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.im.v1.model.CreateMessageReq;
import com.lark.oapi.service.im.v1.model.CreateMessageReqBody;
import com.lark.oapi.service.im.v1.model.CreateMessageResp;

// SDK 使用文档：https://github.com/larksuite/oapi-sdk-java/tree/v2_main
// 复制该 Demo 后, 需要将 "YOUR_APP_ID", "YOUR_APP_SECRET" 替换为自己应用的 APP_ID, APP_SECRET.
// 以下示例代码是根据 API 调试台参数自动生成，如果存在代码问题，请在 API 调试台填上相关必要参数后再使用
public class CreateMessageSample {

	public static void main(String arg[]) throws Exception {
		// 构建client
		Client client = Client.newBuilder("YOUR_APP_ID", "YOUR_APP_SECRET").build();

		// 创建请求对象
		CreateMessageReq req = CreateMessageReq.newBuilder()
			.receiveIdType("user_id")
			.createMessageReqBody(CreateMessageReqBody.newBuilder()
				.receiveId("9896e805-6b1d-41ed-a655-92413971c2a2")
				.msgType("interactive")
				.content("{\"data\":{\"template_id\":\"AAqHIWTScvdtS\",\"template_variable\":{\"object_list_2\":[{\"field_1\":\"申请商户：\",\"field_2\":\"10000000002(测试消息发送)\"},{\"field_1\":\"系统商编号：\",\"field_2\":\"10000000002(测试消息发送)\"},{\"field_1\":\"调额原因：\",\"field_2\":\"商户看数据独立跨境发上来看调计\"},{\"field_1\":\"当前限额：\",\"field_2\":\"日限额:2,000,000元;月限额:5,000,000元\"},{\"field_1\":\"申请限额：\",\"field_2\":\"日限额:8,000,000元;月限额:8,000,000元\"},{\"field_1\":\"当前限额涉及模版：\",\"field_2\":\"202009140365:[ALL]系统商总体收付限额,日限额:2,000,000元;月限额6,000,000元\"},{\"field_1\":\"销售：\",\"field_2\":\"琉璃\"},{\"field_1\":\"相关材料：\",\"field_2\":\"<a href='https://applink.feishu.cn/client/web_app/open?appId=cli_a413ea36f872d00e&mode=sidebar&lk_target_url=https%3A%2F%2Fimg.yeepay.com%2Fhbird-ucm%2Ffeishu-web-app-entry%2Findex.html%23%2Fapp%3FappId%3Dcli_a413ea36f872d00e%26appEncodeUrl%3Dhttps%253A%252F%252Findexmanage.yeepay.com%252Ffrontend%252Falert-center-sidebar%252Findex.html%2523%252Fdetail%253Fid%253D4190775%26exchangeMethod%3Duia'>查看详情</a>\"}],\"seq_id\":\"190775\",\"sidebarTest\":\"https://applink.feishu.cn/client/web_app/open?appId=cli_a413ea36f872d00e&mode=sidebar&lk_target_url=https%3A%2F%2Fimg.yeepay.com%2Fhbird-ucm%2Ffeishu-web-app-entry%2Findex.html%23%2Fapp%3FappId%3Dcli_a413ea36f872d00e%26appEncodeUrl%3Dhttps%253A%252F%252Findexmanage.yeepay.com%252Ffrontend%252Falert-center-sidebar%252Findex.html%2523%252Fdetail%253Fid%253D4190775%26exchangeMethod%3Duia\"},\"template_version_name\":\"1.0.3\"},\"type\":\"template\"}")
				.build())
			.build();

		// 发起请求
		CreateMessageResp resp = client.im().message().create(req);

		// 处理服务端错误
		if(!resp.success()) {
			System.out.println(String.format("code:%s,msg:%s,reqId:%s", resp.getCode(), resp.getMsg(), resp.getRequestId()));
			return;
		}

		// 业务数据处理
		System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
	}
}
