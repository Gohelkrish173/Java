public class TimeDemo{
	public static void main(String[] args) {
		Time t1 = new Time(0,0,10);
		t1.countDown();
	}
}
class Time{
	int hour;
	int minute;
	int second;
	int milisecond;
	Time(int hour, int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void addTime(Time temp){
		this.minute = this.minute + temp.minute; 
		if(this.minute>=60){
			this.hour++;
			this.minute-=60;
		}
		this.hour = this.hour + temp.hour;
	}

	void countDown(){
		while(milisecond!=0 || second!=0){
			milisecond-=50;
			if(milisecond<0){
				second--;
				milisecond+=1000;
			}
			printTime();
			try{
				Thread.sleep(50);
			}catch(Exception e){

			}
		}
		System.out.println("Time up !!!!");
	}

	void printTime(){
		System.out.println(hour+":"+minute+":"+second+":"+milisecond);
	}
}
