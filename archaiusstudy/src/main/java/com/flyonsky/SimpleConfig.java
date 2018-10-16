package com.flyonsky;

import com.netflix.config.DynamicBooleanProperty;
import com.netflix.config.DynamicIntProperty;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

public class SimpleConfig {

	private DynamicStringProperty name = DynamicPropertyFactory.getInstance()
			.getStringProperty("archaius.study.app.name", "archaius_test_name",new Runnable() {
				public void run() {
					 System.out
                     .println("SimpleConfig.name changed to:"
                             + name.get());
				}
			});
	
	private DynamicIntProperty age = DynamicPropertyFactory.getInstance()
			.getIntProperty("archaius.study.app.age", 30,new Runnable() {
				public void run() {
					System.out
                    .println("SimpleConfig.age changed to:"
                            + age.get());
				}
			});
	
	private DynamicBooleanProperty flag = DynamicPropertyFactory.getInstance()
			.getBooleanProperty("archaius.study.app.flag", false,new Runnable() {
				public void run() {
					System.out
                    .println("SimpleConfig.flag changed to:"
                            + flag.get());
				}
			});
	
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SimpleConfig ->name:");
        sb.append(name.get());
        sb.append("\t age:");
        sb.append(age.get());
        sb.append("\t flag:");
        sb.append(flag.get());
        
        return sb.toString();
    };
}
