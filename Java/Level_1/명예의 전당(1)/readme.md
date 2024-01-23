# 명예의 전당(1)  
풀이일자 : 2024. 01. 22.  
	
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/138477
	
풀이방식    

	정석대로 풀었음
	k 길이의 배열 만들고 작은거 밑으로, 큰거 위로 가게 계속 sorting시킴
	가장 작은 수가 현재 들어온 수보다 크면 작은거 빼고 거기다 현재 수 집어놓고 다시 sorting함
	
	근데 Priority Quere가 있네?
	우선순위에 따라 최우선순위인 게 먼저 나옴(즉, 크기가 제일 큰 수 or 제일 작은 수가 먼저 나오게 함)
	그러니까 집어넣기만 하고 큐 끝에서 비교해서 빼야할 땐 빼고 그러면 됨


기억해둘 것  
	
	Priority Queue
	import java.util.PriorityQueue;
	import java.util.Collections;
	
	//낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
	PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

	//높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
	PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
	
	// add(value) 메서드의 경우 만약 삽입에 성공하면 true를 반환, 
	// 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생
	priorityQueueLowest.add(1);
	priorityQueueLowest.add(10);
	priorityQueueLowest.offer(100); // 

	priorityQueueHighest.add(1);
	priorityQueueHighest.add(10);
	priorityQueueHighest.offer(100);

	// 첫번째 값을 반환하고 제거 비어있다면 null
	priorityQueueLowest.poll();

	// 첫번째 값 제거 비어있다면 예외 발생
	priorityQueueLowest.remove(); 

	// 첫번째 값을 반환만 하고 제거 하지는 않는다.
	// 큐가 비어있다면 null을 반환
	priorityQueueLowest.peek();

	// 첫번째 값을 반환만 하고 제거 하지는 않는다.
	// 큐가 비어있다면 예외 발생
	priorityQueueLowest.element();

	// 초기화
	priorityQueueLowest.clear();  