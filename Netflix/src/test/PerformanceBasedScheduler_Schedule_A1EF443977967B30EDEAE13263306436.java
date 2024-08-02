/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.IPacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.PacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class PerformanceBasedScheduler_Schedule_A1EF443977967B30EDEAE13263306436
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public PerformanceBasedScheduler_Schedule_A1EF443977967B30EDEAE13263306436(IContainer parent, String name) {
		super(parent, name, "A1EF443977967B30EDEAE13263306436");
		super.actualScheduleName = "PerformanceBasedScheduler";
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addUserGroup(new UserGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "User Group 1", "A1EF44347F482F44EDEAE13263306436");

			setNumUsers(100.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EF44347F487D64EDEAE13263306436") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					PacedLoop loopNm_1 = pacedLoop_1(this);
					this.add(loopNm_1);
					loopNm_1.addVarsToInit(null);

					this.add(new test.Netflix_WebUI_Test_A1EF442BD3C46240EDEAE13263306436(this,
							"A1EF4434A6050630EDEAE13263306436") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

	private PacedLoop pacedLoop_1(IContainer parent) {
		PacedLoop pacedLoop = new PacedLoop(parent, "Loop1", "A1EF4434ADB5DDA0EDEAE13263306436", 0, 0, 0, 10, 1, true,
				false, 1, 1000, IPacedLoop.RANDOM, false, null) {

			public void executeLoop() {
				this.add(new IterationDelay(this, "PacedLoop Iteration Delay", "A1EF4434ADB5DDA0EDEAE13263306436")); //$NON-NLS-1$

				super.executeLoop();
			}

		};
		return pacedLoop;
	}

}