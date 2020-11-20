package ex0;

public class TestNat_GraphDS {

    public static void main(String[] args) {

        Graph_DS graph = new Graph_DS();
        NodeData n1 = new NodeData(1);
        NodeData n2 = new NodeData(2);


        System.out.println("Graph_DS Tests:\n____________________________\nTest 1:");
        //TEST 1 - getNode
        System.out.println("Current MC:  " + graph.getMC());
        System.out.println("add new node(1):");
        graph.addNode(n1);
        System.out.println("Current MC:  " + graph.getMC());
        System.out.println("add new node(2):");
        graph.addNode(n2);
        System.out.println("Current MC:  " + graph.getMC());
        System.out.print("graph.getNode(1): ");
        System.out.println(graph.getNode(1));


        System.out.println("____________________________\nTest 2:");
        //TEST 2 - hasEdge
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("Checks if nodes 1 and 2 are connected - Must return false:");
        System.out.println(graph.hasEdge(1, 2));
        System.out.println("Current MC:  " + graph.getMC());
        System.out.println("connecting node 1 and 2:");
        graph.connect(1, 2);
        System.out.println("Current MC:  " + graph.getMC());
        System.out.println("Checks if nodes 1 and 2 are connected - Must return true:");
        System.out.println(graph.hasEdge(1, 2));
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());


        System.out.println("____________________________\nTest 3:");
        //TEST 3 - AddNode
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("Current MC:  " + graph.getMC());
        System.out.println("add new node(3):");
        NodeData n3 = new NodeData(3);
        graph.addNode(n3);
        System.out.println("Current MC:  " + graph.getMC());
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());


        System.out.println("____________________________\nTest 4:");
        //TEST 4 - getV
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("graph.getV():" + graph.getV());
        System.out.println("Current MC:  " + graph.getMC());
        System.out.println("removeNode(2):");
        graph.removeNode(2);
        System.out.println("Current MC:  " + graph.getMC());
        System.out.println("graph.getV():" + graph.getV());
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());


        System.out.println("____________________________\nTest 5:");
        //TEST 5 - getV and  Removedge(with id)
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("add new node(3):");
        NodeData n5 = new NodeData(3);
        graph.addNode(n5);
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("Voisins de n1 :" + graph.getV(1));
        System.out.println("Voisins de n3 :" + graph.getV(3));
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("we connect nodes 1 and 3:");
        graph.connect(1, 3);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("Voisins de n1 :" + graph.getV(1));
        System.out.println("Voisins de n3 :" + graph.getV(3));
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("removeEdge(1,3): ");
        graph.removeEdge(1, 3);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("we remove edge between 1 and 3:");
        System.out.println("Voisins de n1 :" + graph.getV(1));
        System.out.println("Voisins de n3 :" + graph.getV(3));


        System.out.println("____________________________\nTest 6:");
        //TEST 6 - removeNode
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("we connect 1 with 2:");
        graph.connect(1, 2);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("we connect 2 with 3:");
        graph.connect(2, 3);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("we connect 1 with 3:");
        graph.connect(1, 3);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("Checks if nodes 1 and 3 are connected - Must return true:");
        System.out.println(graph.hasEdge(1, 3));
        System.out.println("removeEdge(1,3): ");
        graph.removeEdge(1, 3);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("Checks if nodes 1 and 3 are connected - Must return false:");
        System.out.println(graph.hasEdge(1, 3));
        System.out.println("removeEdge(1,3): ");
        graph.removeEdge(1, 3);
        System.out.println("Current MC:  "+graph.getMC());
        NodeData n6 = new NodeData(3);
        System.out.print("add new node(3): ");
        graph.addNode(n6);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.print("Current Graph: ");
        graph.ToString();


        System.out.println("____________________________\nTest 7:");
        //TEST 7 - edgesSize
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        NodeData n7 = new NodeData(7);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.print("add new node(7): ");
        graph.addNode(n7);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("we connect 1 with 7:");
        graph.connect(1, 7);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("we connect 3 with 7:");
        graph.connect(3, 7);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("we connect 1 with 3:");
        graph.connect(1, 3);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
        System.out.println("Nombre de NODES dans le graph: " + graph.nodeSize());
        System.out.println("removeNode(2): ");
        graph.removeNode(2);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("Nombre de NODES dans le graph: " + graph.nodeSize());
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("addNode(2): ");
        graph.addNode(n2);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.print("Current Graph: ");
        graph.ToString();
        System.out.println("we connect 1 with 2:");
        graph.connect(1, 2);
        System.out.println("Current MC:  "+graph.getMC());
        System.out.println("Nombre de EDGES dans le graph: " + graph.edgeSize());
    }

}
