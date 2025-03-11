//Method 1 

var LRUCache = function (capacity) {
    this.cache = new Map();                  // Map creates new array with every function call
    this.capacity = capacity;
    console.log (this);                      // LRUCache { cache: Map(0) {}, capacity: 2 }
};


LRUCache.prototype.get = function (key) {

    console.log("this.cache.has(" +key+ ") before get function : " + this.cache.has(key));
    if (!this.cache.has(key)) return -1;

    const v = this.cache.get(key);
    this.cache.delete(key);
    this.cache.set(key,v);


    // IMPORTANT. if key is not available just return -1
    // But if key was available, means we have called it and hence used it one more time. So we are deleting it and adding it again to make sure that map is in ascending order. least called key in left, and most called key in right.
    console.log("this.cache.has(" +key+ ") after get function = : " + this.cache.has(key));
    console.log (this);
    return this.cache.get(key);
};


LRUCache.prototype.put = function (key, value) {

    console.log("this.cache.has(" +key+ ") before put function : " + this.cache.has(key));

    if (this.cache.has(key)){
        this.cache.delete(key);}
    this.cache.set(key,value);

    console.log("this.cache.has(" +key+ ") after put function set value : " + this.cache.has(key));
    console.log (this);  
    console.log("this.cache.keys().next().value : " +this.cache.keys().next().value);
    console.log (this);  
    if (this.cache.size > this.capacity){
        console.log ("Cache capacity exceeded so deleting this.cache.keys().next().value");
        this.cache.delete(this.cache.keys().next().value);
		
		// keys() will list all keys suppose 1-10, So now next() will go again to first key. which is least used since this is ascending order. and now deleting this least used key since it has exceeded capacity.
		
        console.log (this);
        }
        
};



//Method 2
//Using object and doubly linked list
/*

class Node {
  constructor(key, val) {
      this.key = key;
      this.val = val;
      this.next = null;
      this.prev = null;
  }
}

class DoublyLinkedList {
  constructor() {
      this.head = null;
      this.tail = null;
      this.length = 0;
  }
  
  push(key, val) {
      const newNode = new Node(key, val);
      if(!this.head) {
          this.head = newNode;
          this.tail = newNode;
      } else {
          this.tail.next = newNode;
          newNode.prev = this.tail;
          this.tail = newNode;
      }
      this.length++;
      return newNode;
  }
  
  remove(node) {
      if(!node.next && !node.prev) { // if there's only 1 node
          this.head = null;
          this.tail = null;
      } else if(!node.next) { // if the node is tail node
          this.tail = node.prev;
          this.tail.next = null;
      } else if(!node.prev) { // if the node is head node
          this.head = node.next;
          this.head.prev = null;
      } else { // if the node is in between
          const prev = node.prev;
          const next = node.next;
          prev.next = next;
          next.prev = prev;
      }
      this.length--;
  }
}

class LRUCache {
  constructor(capacity) {
      this.DLL = new DoublyLinkedList();
      this.map = {};
      this.capacity = capacity;
  }

  get(key) {
      if(!this.map[key]) return -1;
      const value = this.map[key].val;
      this.DLL.remove(this.map[key]);
      this.map[key] = this.DLL.push(key, value);
      return value;
  }

  put(key, value) {
      if(this.map[key]) this.DLL.remove(this.map[key]);
      this.map[key] = this.DLL.push(key, value);
      if(this.DLL.length > this.capacity) {
          const currKey = this.DLL.head.key;
          delete this.map[currKey];
          this.DLL.remove(this.DLL.head);
      }
  }
}

*/


// Method 3 
//Using Es6 Map
/*
class LRUCache {
    constructor(capacity) {
        this.map = new Map();
        this.capacity = capacity;
    }

    get(key) {
        if (!this.map.has(key)) return -1;
        const val = this.map.get(key);
        this.map.delete(key);
        this.map.set(key, val);
        return val;
    }

    put(key, value) {
        this.map.delete(key);
        this.map.set(key, value);
        if (this.map.size > this.capacity) {
          const firstItem = this.map.keys().next().value;
          this.map.delete(firstItem);
        }
    }
}


*/


//Method 4 
//Using Hashmap and doubly linked list


/*
var LRUCache = function(capacity) {
    this._capacity = capacity;
    this._count = 0;
    this._head = null;
    this._tail = null;
    this._hashTable = {};
};

LRUCache.prototype.get = function(key) {
    if (this._hashTable[key]) {
        const { value } = this._hashTable[key];
        const { prev, next } = this._hashTable[key];
        if (prev) { prev.next = next; }
        if (next) { next.prev = prev || next.prev; }
        
        if (this._tail === this._hashTable[key]) {
            this._tail = prev || this._hashTable[key];
        }
        
        this._hashTable[key].prev = null;
        if (this._head !== this._hashTable[key]) {
            this._hashTable[key].next = this._head;
            this._head.prev = this._hashTable[key];
        }
        
        this._head = this._hashTable[key];
    
        return value;
    }
    
    return -1;
};


LRUCache.prototype.put = function(key, value) {
    if (this._hashTable[key]) {
        this._hashTable[key].value = value;
        this.get(key);
    } else {
        this._hashTable[key] = { key, value, prev: null, next: null };
        if (this._head) {
            this._head.prev = this._hashTable[key];
            this._hashTable[key].next = this._head;
        }

        this._head = this._hashTable[key];

        if (!this._tail) {
            this._tail = this._hashTable[key];
        }

        this._count += 1;
    }
    
    if (this._count > this._capacity) {
        let removedKey = this._tail.key;

        if (this._tail.prev) {
            this._tail.prev.next = null;
            this._tail = this._tail.prev;
            this._hashTable[removedKey].prev = null;
        }

        delete this._hashTable[removedKey];
        
        this._count -= 1;
    }
};


*/



/*
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.

 

Example 1:

Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4
 

Constraints:

1 <= capacity <= 3000
0 <= key <= 104
0 <= value <= 105
At most 2 * 105 calls will be made to get and put.

*/

