package moz.mitader.sif.info;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import moz.mitader.sif.SIF;
import moz.mitader.sif.web.ApiController;

@Controller
public class InfoController extends ApiController {
	
	@RequestMapping(value="/api/info", method=GET)
	@ResponseBody
	public Info getInfo() {
		return Info.getInstance();
	}
	
	public static class Info {
		
		private static final Info instance = new Info();
		
		private String version;
		
		Info() {
			version = SIF.VERSION;
		}
		
		public static Info getInstance() {
			return instance;
		}
		
		public String getVersion() {
			return version;
		}
	}
}
