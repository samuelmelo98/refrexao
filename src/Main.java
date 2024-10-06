import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Reflexao reflexao = new Reflexao();

/**
 * Chamada de método por reflexao.
 */
        Method method = Reflexao.class.getDeclaredMethod("metodo1",String.class);
        Method method1 = Reflexao.class.getDeclaredMethod("metodo2",boolean.class);
        method.setAccessible(true); // Torna o método acessível se for privado
        method1.setAccessible(true); // Torna o método acessível se for privado
        Object result = method.invoke(reflexao,"test"); // Invoca o método
        Object result1 = method1.invoke(reflexao,true); // Invoca o método
        System.out.println(result.toString());
        System.out.println(result1.toString());
    }
}
