class LRUCache {

  private final Item[] itemList;
  private final int capacity;
  private int size;
  private Item head;
  private Item tail;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.itemList = new Item[10001];
  }

  public int get(int key) {
    Item item = itemList[key];
    if (item == null) return -1;
    refresh(item);
    return  item.value;
  }

  private void refresh(Item item) {
    if (item==head) return;      // got head, do nothing --- tricky point

    if(item != tail) {
      item.next.prev = item.prev; // 2
      item.prev.next = item.next; // 1
    } else {
      // item is tail, (also item is not head, so here head is not tail)
      item.prev.next = null;     // 1
      tail = item.prev;
    }

    item.prev = null;           // 4
    item.next = head;           // 3
    head.prev = item;           // 5

    head = item;
  }

  public void put(int key, int value) {
    Item existItem = itemList[key];
    // do not add new item if already exist ---------------- tricky point
    if(existItem != null) {     
      existItem.value = value;
      refresh(existItem);
      return;
    }


    Item item = Item.create(key, value);
    itemList[key] = item;

    // set head
    Item oldHead = head;
    head = item;
    item.next = oldHead;
    if (oldHead == null) {
      // putting first element, we set tail as well
      tail = item;
    }
    else {
      oldHead.prev = item;
    }

    if (size==capacity) { // evict least recent used item
      itemList[tail.key] = null;
      tail = tail.prev;
      tail.next = null;
    } else {
      size = size + 1;
    }

  }
}

class Item {

  public Integer key;
  public Integer value;
  public Item prev;
  public Item next;

  private Item(final Integer key, final Integer value) {
    this.key = key;
    this.value = value;
  }

  public static Item create(int key, int value) {
    return new Item(key, value);
  }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */