/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package z_1_testFabricIndex.z_1_testFabricIndex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@GetMapping("/greeting")
	  public String greetingForm(Model model) {
		//Greeting g = new Greeting();
		
	    model.addAttribute("greeting", new Greeting());
	    
	    return "greeting";// + new TestMIIClient().executeGETService();
	  }

	  @PostMapping("/greeting")
	  public String greetingSubmit(@ModelAttribute Greeting greeting) {
		  
		  /*Result result = new Result();
		  result.setSchId("schId " + greeting.getIp());
		  result.setSchName("schName " + greeting.getPort());
		  */
		  greeting.setIp(greeting.getIp()+greeting.getIp());
		  greeting.setPort(greeting.getPort()+greeting.getPort());
		  greeting.setUsername(greeting.getUsername()+greeting.getUsername());
		  greeting.setPasswrd(greeting.getPasswrd()+greeting.getPasswrd());
		  //greeting.setContent("MII DATA - "+new TestMIIClient().executeGETService() );
		  //greeting.setId(1234);
	    return "result";
	  }
}
