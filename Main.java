class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Ajit");

        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            stringBuilder.append("Shiwankar");
        }

        System.out.println("String Builder Time => "+(System.currentTimeMillis()-currentTimeMillis)+"ms");
        currentTimeMillis=System.currentTimeMillis();

       StringBuffer stringBuffer= new StringBuffer();

       for (int i = 0; i < 10000000; i++) {
        stringBuffer.append("Shiwankar");
    }

    System.out.println("String Buffer Time => "+(System.currentTimeMillis()-currentTimeMillis)+"ms");

    }
}