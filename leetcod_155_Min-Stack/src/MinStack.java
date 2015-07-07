class MinStack {
	//init a array which size is 1
	int[] a = new int[1];
	//after push a val to stack, stack_len add 1, so init it -1(不规范)
	int stack_len = -1;
	
	//creat push method, if nums of elements is equal to stack's size, resize method will expand length
    public void push(int x) {
    	if (stack_len == a.length-1) resize(2*a.length);
    	stack_len++;
    	a[stack_len] = x;
    	
    }

    public void pop() {
       	stack_len--;
        
    }

    public int top() {
		return a[stack_len];
        
    }
    //two loops to compare min element one by one(- -)
    public int getMin() {
    	int N = stack_len;
    	int Min_Num = a[N];
    	for (int i = 0; i < a.length; i++) {
    		if(N>=0)
				{int p1 = a[N];
				N--;
				if (N>=0&&a[N] < Min_Num ) {
					Min_Num = a[N];
				}
				}
			else {
				break;
			}
		}
    	return Min_Num;  
    }
    
    //resize length of stack to max
    //creat a bigger array, then copy a to it
    //stack_len is max index of stack, and max is real length of array
    /*
     * 
     * n------ <- max length is n >= 2*length
     * .------
     * .------
     * .------
     * 5------
     * 4------
     *  ______
     * 3------ <- stack_len is 3, length is 4
     * 2------
     * 1------
     * 0------
     * 
     * 
     * 
     * 
     * */
    private void resize(int max){
    	int[] temp = new int[max];
    	for (int i = 0; i <= stack_len; i++) {
			temp[i] = a[i];
    	}
		a = temp;
		
    }
    //test
    public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-10);
		minStack.push(14);
		System.out.println(minStack.getMin());
		System.out.println(minStack.getMin());
		minStack.push(-20);
		System.out.println(minStack.getMin());
		System.out.println(minStack.getMin());


		

	}
}
