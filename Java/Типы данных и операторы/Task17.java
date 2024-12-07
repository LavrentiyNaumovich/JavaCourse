public class Task17 {
    public static void main(String[] args) {
        int i = 0;

        int a = 2; 

        switch (a) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
        }

        System.out.println("i = " + i);
    }
}
/*
 Если в switch блоках отсутствует break, то выполняется так называемый "провал" (fall through), 
 и выполнение программы переходит в следующий блок case даже если условие для него не выполняется.
 В этом примере, если a = 2, то результат будет i = 3, так как выполнение "проваливается" из case 2 в case 3.
 Если a = 1, то результат будет i = 1 (из-за break в case 1). Для других значений — будет выполнен блок default.
 */