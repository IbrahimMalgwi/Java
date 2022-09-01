package dietel.Chapter5;

class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(222222, "Ford Fusion", "ME");
        AutoPolicy policy3 = new AutoPolicy(6666666, "Benz Fusion", "SS");

//        AutoPolicyTest red = new AutoPolicyTest();

        AutoPolicy.policyInNoFaultState(policy1);
        AutoPolicy.policyInNoFaultState(policy2);
        AutoPolicy.policyInNoFaultState(policy3);

    }


}