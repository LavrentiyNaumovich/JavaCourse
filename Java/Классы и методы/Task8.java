import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        // Создаем списки с различными типами
        List<? extends Number> listExtends = new ArrayList<>();
        List<? super Integer> listSuper = new ArrayList<>();

        // Можем только читать из коллекции, но не можем вставлять.
        // listExtends.add(10); // Ошибка компиляции
        Number number = listExtends.get(0); // Можно читать элементы как Number (или его подтипы)

        // Можем добавлять элементы в коллекцию.
        listSuper.add(10); // Это разрешено, так как Integer является подклассом Number
        
        // Можем добавить элементы любого типа, наследующегося от Integer.
        listSuper.add(20); 

        System.out.println("listSuper: " + listSuper);
    }
}
/*
Конструкции <? extends T> и <? super T> помогают создать более гибкие и обобщенные методы и классы, которые могут работать с различными типами, 
поддерживая безопасность типов и предотвращая ошибки времени выполнения.
 */