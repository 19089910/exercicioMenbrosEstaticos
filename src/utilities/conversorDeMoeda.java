package utilities;

public class conversorDeMoeda {
    public static double roubo = 1.06;//1.06 = precoDola/0.06 + precoDola

    public static double dolaParaReal(double precoDola, double quantidade){
        return quantidade * precoDola * roubo;
    }
    public static double semIOF(double precoDola, Double quantidade){
        return quantidade * precoDola;
    }
}
