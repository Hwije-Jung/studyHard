package javaStudy.collection.linkedlist;


public class LinkedList<T> {
  public Node<T> head = null;

  public class Node<T> {
    T data;
    Node<T> next = null;

    public Node(T data) {
      this.data = data;
    }
  }

  public void addNode(T data) {
    if (head == null) {
      // 처음 만들어 질때 헤드값이 널이라면
      //최초 생성되는 노드의 주소값 헤드에 넣음
      // 알아야 찾아들어갈 수 있다.
      head = new Node<T>(data);
    } else {
      Node<T> node = this.head;
      while (node.next != null) {
        node = node.next;
        // 다음노드 next에 넣음
      }
      node.next = new Node<T>(data);
    }
  }

  public void printAll() {
    if (head != null) {
      Node<T> node = this.head;
      System.out.println(node.data);
      while (node.next != null) {
        node = node.next;
        System.out.println(node.data);
      }
    }
  }

  public Node<T> search(T data) {
    if (this.head == null) {
      return null; //헤드가 널이면 널을 리턴
    } else { // 널이 아니면
      Node<T> node = this.head;
      while(node != null) {
        if (node.data == data) {
          return node;
        } else {
          node = node.next;
        }
      }
      return null;
    }
  }

  public void addNodeInside(T data, T isData) {
    Node<T> searchedNode = this.search(isData);
    //search를 통해 찾고 반환시킴 // isData뒤에 넣을 거다.
    // 중간에 낑겨놓고 끼워놓은 노드 연결해줌
//    MyLinkedList.addNodeInside(5, 1);
//    MyLinkedList.printAll();
    //1 5 2 3 원래 123이었음
    if (searchedNode == null) {
      this.addNode(data); // 없으면 에드시킴
    } else {
      Node<T> nextNode = searchedNode.next;
      searchedNode.next = new Node<T>(data); //새로생성
      searchedNode.next.next = nextNode;
      //next 의 next는 '5'의 다음 주소변수
    }
  }
}

