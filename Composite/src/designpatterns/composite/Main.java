package designpatterns.composite;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("doc1");
        File file2 = new File("doc2");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        folder1.add(file1);
        folder1.add(folder2);
        folder2.add(file2);
        System.out.println(folder1.getName());
        for(Component c : folder1.getComponents()) {
            System.out.print(c.getName() + " ");
        }
        System.out.println("");
        System.out.println(folder2.getName());
        for(Component c : folder2.getComponents()) {
            System.out.print(c.getName() + " ");
        }
    }
}
