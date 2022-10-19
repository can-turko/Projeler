public class ListClass<T> {
    T[] array;
    private int capacity = 10;
    private int count =-1;
    private int cString =0;

    ListClass(){
        array = (T[])new Object[capacity];
    }
    ListClass(int capacity){
        this.capacity=capacity;
        array = (T[])new Object[capacity];
    }
    public void add(T value){
        count++;
        if(count >= capacity){
            capacity *= 2;
            T[] array = (T[])new Object[capacity];
            for(int i = 0 ; i < this.array.length; i++){
                array[i]=this.array[i];
            }
            this.array = array;
        }

        this.array[count] =  value;

    }
    public T get(Integer indexNumber){
        if(indexNumber >= this.capacity) return null;
        return array[indexNumber];
    }
    public void remove(Integer indexNumber){
        if(indexNumber < size()-1){
            for(int i = indexNumber; i<capacity-1;i++){
                array[i] = array[i+1];
            }

        }
        array[size()] = null;
    }
    public int size(){
        int size = 0;
        for(int i = 0 ; i < capacity ; i ++){
            if(array[i] != null) size++;
            else break;
        }
        return size;
    }
    public int getCapacity(){
        return capacity;
    }
    public void allShow(){
        for(T value:this.array){
            System.out.print(value+" ");
        }
    }
    public void set(int index, T data){
        this.array[index]=data;
    }
    @Override
    public  String toString(){
        String[] string = new String[capacity];
        if(this.count==-1)return null;
        for(int i = 0 ; i < capacity; i++){
            string[i]=String.valueOf(array[i]);
        }
        if(cString == size()-1) return string[cString]+ "]";
        else if(cString == 0) return "["+string[cString++]+","+toString();
        return  string[cString++]+","+toString();
    }
    int indexOf(T data){
        int a = -1;
        for(int i = 0; i < size();i++){
            if(array[i] == data){
                a = i;
            }
        }
        return a;
    }
    int lastOfIndex(){
        return this.count;
    }
    boolean isEmpty(){
        if(count == -1)return true;
        else return false;
    }
    T[] toArray(){
        T[] array2 = (T[])new Object[this.count+1];
        for(int i = 0; i < this.count+1;i++){
            array[i]=array2[i];
        }
        return array2;
    }
    void clear(){
        this.count=-1;
        array[0]=null;
    }
    ListClass<T> sublist(int start, int finish){
        int a = 0;
        ListClass<T> sublist = new ListClass<>(finish-start);
        for(int i = start; i < finish; i++){
            array[i]=sublist.array[a++];
        }
        return sublist;
    }
    boolean contains(T value){
        for(T j:array){
            if(j == value)return true;
        }
        return false;
    }
}
