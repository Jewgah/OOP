package ex0;

public class TestNat_NodeData {

    public static void main(String[] args) {

        Graph_DS graph =new Graph_DS();
        NodeData n1 =new NodeData(1);
        NodeData n2 =new NodeData(2);

        graph.addNode(n1);
        graph.addNode(n2);

        System.out.println("NodeData Tests:");
        //TEST 1 - GET KEY
        System.out.println("____________________________\nTest 1:");
        System.out.print("Prints n1.getKey: ");
        System.out.println(n1.getKey());
        System.out.println("____________________________\nTest 2:");


        //TEST 2 - GETNI
        graph.connect(1,2);
        System.out.println("n1.getNi: " +n1.getNi());
        System.out.print("graph.tostring: ");
        graph.ToString();
        System.out.println("____________________________\nTest 3:");



        //TEST 3 - RemoveEdge
        System.out.println("Connected - Must return true");
        System.out.println(graph.hasEdge(1,2));
        graph.removeEdge(1,2);
        System.out.println("\nremoveEdge - Must return false");
        System.out.println(graph.hasEdge(1,2));
        System.out.println("____________________________\nTest 4:");


        //TEST 4 - HaseNi
        System.out.println("n1.hasNi(2) ? - Must return false:\n"+n1.hasNi(2));
        System.out.println("connect(1,2) :");
        graph.connect(1,2);
        System.out.println("n1.hasNi(2) ? - Must return true:\n"+n1.hasNi(2));
        System.out.println("____________________________\nTest 5:");



        //TEST 5 - AddNi
        System.out.print("n2.getNi: ");
        System.out.println(n2.getNi().toString());
        NodeData n3 =new NodeData(3);
        System.out.println("- NodeData n3 = new NodeData(3) - \nn2.addNi(n3)");
        n2.addNi(n3);
        System.out.println("\"n2.getNi: "+n2.getNi().toString());
        System.out.println("____________________________\nTest 6:");



        //TEST 6 - RemoveNode
        System.out.print("graph.tostring: ");
        graph.ToString();
        graph.removeNode(1);
        System.out.println("- removeNode(1) -");
        System.out.print("graph.tostring: ");
        graph.ToString();
        System.out.println("____________________________");



    }
}