package little.ant.pingtai.controller;

import little.ant.pingtai.annotation.Controller;
import little.ant.pingtai.service.OperatorService;
import little.ant.pingtai.service.SysLogService;

import org.apache.log4j.Logger;

@Controller(controllerKey = "/jf/test")
public class TestController extends BaseController {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(TestController.class);

	public void operator() {
		OperatorService.service.list(splitPage);
		render("/pingtai/test/operator.html");
	}

	public void sysLog() {
		defaultOrder("startdate", "desc");
		SysLogService.service.list(splitPage);
		render("/pingtai/test/sysLog.html");
	}
	
}


