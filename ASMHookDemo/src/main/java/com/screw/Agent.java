package com.screw;

import java.lang.instrument.Instrumentation;

public class Agent {
    public static void premain(String agentArgs, Instrumentation inst) throws Exception {

        inst.addTransformer(new HookTransform());
    }
}
