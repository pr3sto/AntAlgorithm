package Graph;

// �����
public class Edge {
    public double pheromone;
    public int weight;
    public int firstNode;         // �� �������
    public int secondNode;        // �� �������
    public boolean inCurrentPath; // �������������� � ����

    public Edge(int weight_, int firstNode_, int secondNode_) {
        pheromone = 0.0;
        weight = weight_;
        firstNode = firstNode_;
        secondNode = secondNode_;
        inCurrentPath = false;
    }
}
