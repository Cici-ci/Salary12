public class Main {
    public static void main(String[] args) {
        TextBox textBox1=new TextBox();
        TextBox textBox2=textBox1;

        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
    }
}