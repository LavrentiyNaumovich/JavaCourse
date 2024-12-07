public class Task4 {
    public static void main(String[] args) {
        
        // 1. StringBuffer - append() - Добавляет строку в конец
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", World!");
        System.out.println("After append: " + sb);  // "Hello, World!"
        
        // 2. StringBuffer - insert() - Вставляет строку в заданную позицию
        sb.insert(5, " this");
        System.out.println("After insert: " + sb);  // "Hello this, World!"
        
        // 3. StringBuffer - delete() - Удаляет часть строки с указанными индексами
        sb.delete(5, 15);
        System.out.println("After delete: " + sb);  // "Hello, World!"
        
        // 4. StringBuffer - reverse() - Переворачивает строку
        sb.reverse();
        System.out.println("After reverse: " + sb);  // "!dlroW ,olleH"
        
        // 5. StringBuffer - replace() - Заменяет часть строки на другую строку
        sb.replace(0, 5, "Greetings");
        System.out.println("After replace: " + sb);  // "Greetings, olleH"
        
        // 6. StringBuilder - append() - Добавляет строку в конец
        StringBuilder sb2 = new StringBuilder("Java");
        sb2.append(" Programming");
        System.out.println("StringBuilder after append: " + sb2);  // "Java Programming"
        
        // 7. StringBuilder - insert() - Вставляет строку в указанную позицию
        sb2.insert(4, " Language");
        System.out.println("StringBuilder after insert: " + sb2);  //  "Java Language Programming"
        
        // 8. StringBuilder - delete() - Удаляет часть строки с заданными индексами
        sb2.delete(4, 16);
        System.out.println("StringBuilder after delete: " + sb2);  // "Java Programming"
        
        // 9. StringBuilder - reverse() - Переворачивает строку
        sb2.reverse();
        System.out.println("StringBuilder after reverse: " + sb2);  // "gnimmargorP avaJ"
        
        // 10. StringBuilder - capacity() - Возвращает емкость StringBuilder
        int capacity = sb2.capacity();
        System.out.println("StringBuilder capacity: " + capacity);  // 32 (default initial capacity)
    }
}
