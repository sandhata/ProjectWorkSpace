/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Netflix_WebUI2_Test_A1EF443A05F307E0EDEAE13263306436 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Netflix_WebUI2_Test_A1EF443A05F307E0EDEAE13263306436(IContainer container, String invocationId) {
		super(container, "Netflix_WebUI2", invocationId, "A1EF443A05F307E0EDEAE13263306436", "/Netflix/Netflix_WebUI2.testsuite", "C:/HCL_ONETEST/ProjectWorkSpace/Netflix/Netflix_WebUI2.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Netflix_WebUI2_Test_A1EF443A05F307E0EDEAE13263306436 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EF443A05F32EFDEDEAE13263306436");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start www.netflix.com",
												  "A1EF443A05F8D440EDEAE13263306436",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>www.netflix.com<\\/b>\",\"to_overriden\":true,\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":11,\"optionalStep\":false,\"uid\":\"A1EF443A05F8D440EDEAE13263306436\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"www.netflix.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/www.netflix.com\\/in\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/Netflix/Netflix_WebUI2.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign In - www.netflix.com",
												  "A1EF443A05FD1A04EDEAE13263306436",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign In<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":11,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EF443A05FD1A04EDEAE13263306436\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:42;left:1553;bottom:90;right:1667\\\", \\\"Geometry\\\": { \\\"height\\\": 48, \\\"width\\\": 113, \\\"x\\\": 1553, \\\"y\\\": 42 }, \\\"Style$array$\\\": \\\"background-color:rgb(193, 17, 25);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif;font-size:14px;font-style:normal;font-weight:500;line-height:14px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:4px;padding-left:16px;padding-right:16px;padding-top:4px;text-align:start;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"C11119FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 90, \\\"class\\\": \\\" e1ax5wel2 ew97par0 default-ltr-cache-1vql4q4 e1ff4m3w1\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Sign In\\\", \\\"data-uia\\\": \\\"header-login-link\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif\\\", \\\"font-size\\\": 14, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"500\\\", \\\"href\\\": \\\"\\\\\\/in\\\\\\/login\\\", \\\"id\\\": \\\"signIn\\\", \\\"left\\\": 1553, \\\"line-height\\\": \\\"14\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 4, \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": 4, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1667, \\\"role\\\": \\\"button\\\", \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 42, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"308\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/a[@id='signIn']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/Netflix/Netflix_WebUI2.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'sachin.narang@sandhata.com' in Edit text whose Label is Email or mobile number - www.netflix.com",
												  "A1EF443A0613D654EDEAE13263306436",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Enter value '<b>sachin.narang@sandhata.com<\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Email or mobile number<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EF443A0613D654EDEAE13263306436\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"sachin.narang@sandhata.com\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Email or mobile number\"},\"name\":\"label\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:316;left:713;bottom:400;right:1184\\\", \\\"Geometry\\\": { \\\"height\\\": 84, \\\"width\\\": 471, \\\"x\\\": 713, \\\"y\\\": 316 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:16px;padding-right:16px;padding-top:24px;text-align:left;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"autocomplete\\\": \\\"email\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 400, \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"\\\", \\\"data-uia\\\": \\\"login-field\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\":r0:\\\", \\\"label\\\": \\\"Email or mobile number\\\", \\\"left\\\": 713, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"userLoginId\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": 24, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1184, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 316, \\\"type\\\": \\\"text\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"129\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id=':r0:']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Netflix/Netflix_WebUI2.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'Test@2024' in Edit text whose Label is Password - www.netflix.com",
												  "A1EF443A061E5DA4EDEAE13263306436",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EF443A061E5DA4EDEAE13263306436\",\"preferredThinktime\":0,\"thinktime\":7543,\"isWeb\":false,\"description\":\"Think <i>7,543<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>Test@2024<\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Password<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EF443A061E5DA4EDEAE13263306436\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Test@2024\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Password\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:424;left:713;bottom:508;right:1136\\\", \\\"Geometry\\\": { \\\"height\\\": 84, \\\"width\\\": 423, \\\"x\\\": 713, \\\"y\\\": 424 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:32px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:16px;padding-right:16px;padding-top:24px;text-align:left;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"autocomplete\\\": \\\"password\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 508, \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"\\\", \\\"data-uia\\\": \\\"password-field\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\":r3:\\\", \\\"label\\\": \\\"Password\\\", \\\"left\\\": 713, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 32, \\\"margin-top\\\": 0, \\\"name\\\": \\\"password\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": 24, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputpassword\\\", \\\"right\\\": 1136, \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 424, \\\"type\\\": \\\"password\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"244\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id=':r3:']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Netflix/Netflix_WebUI2.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Sign In - www.netflix.com",
												  "A1EF443A0629CF54EDEAE13263306436",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EF443A0629CF54EDEAE13263306436\",\"preferredThinktime\":0,\"thinktime\":3913,\"isWeb\":false,\"description\":\"Think <i>3,913<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Sign In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EF443A0629CF54EDEAE13263306436\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:532;left:713;bottom:592;right:1184\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 471, \\\"x\\\": 713, \\\"y\\\": 532 }, \\\"Style$array$\\\": \\\"background-color:rgb(193, 17, 25);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif;font-size:16px;font-style:normal;font-weight:500;line-height:16px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:16px;padding-right:16px;padding-top:6px;text-align:center;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"C11119FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 592, \\\"class\\\": \\\" e1ax5wel2 ew97par0 default-ltr-cache-62lxnw e1ff4m3w2\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Sign In\\\", \\\"data-uia\\\": \\\"login-submit-button\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"500\\\", \\\"left\\\": 713, \\\"line-height\\\": \\\"16\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 16, \\\"padding-right\\\": 16, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 1184, \\\"role\\\": \\\"button\\\", \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 532, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"471\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='appMountPoint']\\\\\\/div\\\\\\/div\\\\\\/div[2]\\\\\\/div\\\\\\/form\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/Netflix/Netflix_WebUI2.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose data-uia is nmhp-card-cta+hero_fuji - www.netflix.com",
												  "A1EF443A06340884EDEAE13263306436",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EF443A06340884EDEAE13263306436\",\"preferredThinktime\":0,\"thinktime\":4391,\"isWeb\":false,\"description\":\"Think <i>4,391<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>data-uia<\\/b> is <b>nmhp-card-cta+hero_fuji<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EF443A06340884EDEAE13263306436\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"data-uia\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"nmhp-card-cta+hero_fuji\"},\"name\":\"data-uia\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:687;left:764;bottom:771;right:1133\\\", \\\"Geometry\\\": { \\\"height\\\": 84, \\\"width\\\": 368, \\\"x\\\": 764, \\\"y\\\": 687 }, \\\"Style$array$\\\": \\\"background-color:rgb(193, 17, 25);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif;font-size:24px;font-style:normal;font-weight:500;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12px;padding-left:24px;padding-right:24px;padding-top:12px;text-align:center;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"C11119FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 771, \\\"class\\\": \\\" e1ax5wel2 ew97par0 default-ltr-cache-16c65dm e1ff4m3w2\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Finish Sign Up\\\", \\\"data-uia\\\": \\\"nmhp-card-cta+hero_fuji\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif\\\", \\\"font-size\\\": 24, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"500\\\", \\\"left\\\": 764, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 24, \\\"padding-right\\\": 24, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 1133, \\\"role\\\": \\\"button\\\", \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 687, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"281\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='appMountPoint']\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/div[2]\\\\\\/div\\\\\\/div[2]\\\\\\/div\\\\\\/div\\\\\\/form\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/Netflix/Netflix_WebUI2.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign Out - www.netflix.com",
												  "A1EF443A0643E704EDEAE13263306436",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1EF443A0643E704EDEAE13263306436\",\"preferredThinktime\":0,\"thinktime\":3564,\"isWeb\":false,\"description\":\"Think <i>3,564<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign Out<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"d9ac482c-ad3b-4e80-b26f-a30a4c6087fa\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EF443A0643E704EDEAE13263306436\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign Out\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:0;left:1725;bottom:135;right:1841\\\", \\\"Geometry\\\": { \\\"height\\\": 135, \\\"width\\\": 115, \\\"x\\\": 1725, \\\"y\\\": 0 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(51, 51, 51);font-family:\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif;font-size:19px;font-style:normal;font-weight:500;line-height:90px;margin-bottom:0px;margin-left:37.9583px;margin-right:37.9583px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:underline solid rgb(51, 51, 51);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 135, \\\"class\\\": \\\"authLinks signupBasicHeader onboarding-header\\\", \\\"color\\\": \\\"333333FF\\\", \\\"content\\\": \\\"Sign Out\\\", \\\"data-uia\\\": \\\"header-signout-link\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Netflix Sans\\\\\\\", \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Segoe UI\\\\\\\", Roboto, Ubuntu, sans-serif\\\", \\\"font-size\\\": 19, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"500\\\", \\\"href\\\": \\\"\\\\\\/signout\\\", \\\"left\\\": 1725, \\\"line-height\\\": \\\"90\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": \\\"37.9583\\\", \\\"margin-right\\\": \\\"37.9583\\\", \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1841, \\\"tagname\\\": \\\"a\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"underline solid rgb(51, 51, 51)\\\", \\\"top\\\": 0, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"83\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='appMountPoint']\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/a[2]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/Netflix/Netflix_WebUI2.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
