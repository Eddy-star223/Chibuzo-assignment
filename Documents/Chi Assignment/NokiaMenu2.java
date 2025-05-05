import java.util.Scanner;

public class NokiaMenu2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);



String menu = """

++++++++++++++++++++++++++++++++++
   Welcome to Nokia 3310
++++++++++++++++++++++++++++++++++

 1 phone book
 2 message
 3 chat
 4 call register
 5 tone
 6 settings
 7 call divert
 8 game
 9 calculator
 10 reminders
 11 clock
 12 profile
 13 sim service

""";


menu:
while (true) {
System.out.println(menu);
System.out.println("Enter number to continue");
int userChoice = input.nextInt();
switch (userChoice) {


case 1:
while (true) {
phoneBook:
	System.out.println("""

+++++++++++++++++++++++
	Phone book: 
+++++++++++++++++++++++

 	1 Search 
	2 Service Nos.
	3 Add name 
	4 Erase 
	5 Edit 
	6 Assign tone
	7 Send b'card 
 	8 Options 
	9 speed dials 
	10 voice tags
	0 Back
	
	""");

System.out.println("Press number to continue"); 

	
	int phoneBook = input.nextInt();
	switch (phoneBook) { 
 
 case 1:{ 
	while (true) {
	System.out.println("""
	Search
	0 Back
	""");

	int simChoses = input.nextInt();
	if (simChoses == 0) break;

}
}
  
 case 2:{
	 while (true) {
	 System.out.println("""
	Service Nos.
	0 Back
	"""); 

	int simChoses = input.nextInt();
	if (simChoses == 0) break;

}
}

 case 3:{ 
	while (true) {
	 System.out.println("""
	Add name
	0 Back
	""");

	int simChoses = input.nextInt();
	if (simChoses == 0) break;
}
}


 case 4:{
	while (true) {
	 System.out.println("""
	Erase
	0 Back
	"""); 
	
	int simChoses = input.nextInt();
	if (simChoses == 0) break;
}
}

 case 5:{
	while (true) {
 	System.out.println("""
	Edit
	0 Back
	""");

	int simChoses = input.nextInt();
	if (simChoses == 0) break;
}
}

 case 6:{
	while (true) {
 	System.out.println("""
	Assign tone
	0 Back
""");

	int simChoses = input.nextInt();
	if (simChoses == 0) break;

}
} 
 
 case 7:{
	while (true) {
	 System.out.println("""

	Send b'card
	0 Back
	"""); 
	
	int simChoses = input.nextInt();
	if (simChoses == 0) break;

}
} 

 case 8:
	 System.out.println("""

++++++++++++++++++++++++++++
	Enter options:
++++++++++++++++++++++++++++

	1 type of view  
	2 memory status
	0 Back 
	""");


	
System.out.println("Press number to continue");


	int options = input.nextInt();
	switch (options) {

case 1:{
	while (true){	
	System.out.println("""
	 View here	
	          0 back
	""");

	int simChoses = input.nextInt();
	if (simChoses == 0) break;

	
}

}
	

	
case 2:{ 
	while (true) { 
 	System.out.println("""
	Memory status
	0 Back
	""");

	int simChoses = input.nextInt();
	if (simChoses == 0) break;


}
}
}


	
case 9: System.out.println("speed dials"); break; 
case 10: System.out.println("voice tags"); break;

case 0: continue menu;

default: System.out.println("Invalid Input, Try again");

}
break;
}
break;



case 2:
while (true) {
message: 	
	System.out.println("""

++++++++++++++++++++++++
	Message:
++++++++++++++++++++++++

	1 Write messages
	2 Inbox
	3 Outbox
	4 Picture messages
	5 Templates
	6 Smiley
	7 Message settings
	8 Info service
	9 Voice service
	10 Service command editor 
	""");
System.out.println("Press number to continue");


	int message = input.nextInt();
	switch (message) {

 case 1: System.out.println("Write messages"); break; 
 case 2: System.out.println("Inbox"); break;
 case 3: System.out.println("Outbox"); break;
 case 4: System.out.println("Picture messages"); break;
 case 5: System.out.println("Templates"); break;
 case 6: System.out.println("Smileys"); break;
 case 7: System.out.println("""

 ++++++++++++++++++++++++++++++++++
	Message settings: 
 ++++++++++++++++++++++++++++++++++

	1 Set 1
	2 Common
	""");

System.out.println("Press number to continue");


	int messageSettings = input.nextInt();
	switch (messageSettings) {

case 1: System.out.println("""

++++++++++++++++++++++++++
	Set 1:
++++++++++++++++++++++++++

	1 Message centre number
	2 Message sent as
	3 Message validity
	0 Back 
	""");
System.out.println("Enter number to continue");

	int set1 = input.nextInt();
	switch (set1) {
case 1:	System.out.println("Message centre number"); break;
case 2: System.out.println("Message sent as"); break;  
case 3: System.out.println(" Message validity"); break;  
case 0: continue menu;
default: System.out.println("Invalid Input, Try again"); break;
	
} 

case 2: System.out.println("""

++++++++++++++++++++++++
	Common:
++++++++++++++++++++++++

	1 Delivery reports
	2 reply via same centre 
	3 Character
	""");
System.out.println("Enter number to continue");

	int common = input.nextInt();
	switch (common) {
case 1:	System.out.println("Delivery reports"); break;
case 2: System.out.println("reply via same centre"); break;  
case 3: System.out.println("Character"); break;  
}
case 8: System.out.println("Info service"); break;
 case 9: System.out.println("Voice service"); break;
 case 10: System.out.println("Service command editor");break; 
case 0: continue menu;
default: System.out.println("Invalid Input try again");


}
}	

}
case 3:	System.out.println("""

	Chat
	0 Back

"""); 

int chat = input.nextInt();
switch(chat){
	case 0: continue menu;

	default: System.out.println("Invalid Input try again");

}
break;

case 4:
while (true) {
callRegister:
 	System.out.println("""

+++++++++++++++++++++++++++++++
	Call register:
+++++++++++++++++++++++++++++++

	1 Missed calls
	2 Received calls
	3 Dialled call
	4 Erase recent call lists
	5 Show call duration
	6 Show call costs
	7 Show cost settings
	8 Prepaid credit
	0 Back

	""");
System.out.println("Enter number to continue");


	int callRegister = input.nextInt();
	switch (callRegister) {

 case 1: System.out.println("Missed calls"); break; 
 case 2: System.out.println("Received calls"); break;
 case 3: System.out.println("Dialled calls"); break;
 case 4: System.out.println("Erase recent call list "); break;
 
case 5:
while (true) {
	 System.out.println("""

++++++++++++++++++++++++++++++++++
	Show call duration:
++++++++++++++++++++++++++++++++++

	1 Last call duration
	2 All calls' duration
	3 Received calls' duration
	4 Dialled calls' duration
	5 Clear timers
	""");
System.out.println("Enter number to continue");


	int showCallDuration = input.nextInt();
	switch (showCallDuration) {

case 1:	System.out.println("Last call duration"); break;
case 2: System.out.println("All calls' duration"); break;  
case 3: System.out.println("Received calls' duration"); break;
case 4: System.out.println("Dialled calls' duration"); break;
case 5: System.out.println("Clear timers"); break;
case 0: continue menu;
default: System.out.println("Invalid Input, Try again");

}
break; 
 }


case 6:
while (true) {	
	System.out.println("""

++++++++++++++++++++++++++++++++
	Show call costs:
++++++++++++++++++++++++++++++++

	1 Last call cost
	2 All calls' cost 
	3 Clear counters
	""");

System.out.println("Enter number to continue");

int showCallCoats = input.nextInt();
	switch (showCallCoats) {

case 1:	System.out.println("Last calls' cost"); break;
case 2: System.out.println("All calls' cost"); break;  
case 3: System.out.println("Clear counters"); break;
case 0: continue menu;
default: System.out.println("Invalid Input, Try again");
  	
}

}


case 7:
while (true) {
	System.out.println("""

+++++++++++++++++++++++++++++++++++++
	Call cost settings:
+++++++++++++++++++++++++++++++++++++

	1 Call cost limit
	2 Show cost in 
	""");

int callCostSettings = input.nextInt();
	switch (callCostSettings) {

case 1:	System.out.println("Call cost limit"); break;
case 2: System.out.println("Show cost in"); break;
case 0: continue menu;
default: System.out.println("Invalid Input, Try again");

}
}

 case 8: System.out.println("Prepaid credit"); break;
 case 0: continue menu;
 default: System.out.println("Invalid Input, Try again");
	 
}
}

case 5:
while (true) {
tone:
	System.out.println("""

+++++++++++++++++++++++++++
	Tones: 
+++++++++++++++++++++++++++

 	1 Ringing tone 
	2 Ringing volume
	3 Incoming call alert
	4 Composer
	5 Message alert tone
	6 Kaypad tones
	7 Warning and game tones
 	8 Vibrating alert
	9 Screen saver
	
	""");
	
	int tones = input.nextInt();
	switch (tones) {
 
 case 1: System.out.println("Ringing tone"); break; 
 case 2: System.out.println("Ringing volume"); break;
 case 3: System.out.println("Incoming call alert"); break;
 case 4: System.out.println("Composer"); break;
 case 5: System.out.println("Message alert tone"); break;
 case 6: System.out.println("Keypad tones"); break;
 case 7: System.out.println("Warning and game tones"); break;
 case 8: System.out.println("Vibrating alert"); break;
 case 9: System.out.println("Screen saver"); break;
	
}
System.out.println("Press 0 to go back");
if (input.nextInt() == 0) {
continue menu;
}
}



case 6:
while (true) {
settings:
        System.out.println("""

++++++++++++++++++++++++++++++
	Settings:
++++++++++++++++++++++++++++++

	1 Call settings 
	2 Phone settings
	3 Security settings
	4 Restore factory settings
	
	""");


	int settings = input.nextInt();
	switch (settings) {

case 1:
while (true) {	
	 System.out.println("""

+++++++++++++++++++++++++++++++++
	Call settings:
+++++++++++++++++++++++++++++++++

	1 Automatic redial
	2 Speed dialling
	3 Call waiting options
	4 Own number sending
	5 Phone line in use
	6 Automatic answer
	""");

	int callSettings = input.nextInt();
	switch (callSettings) {

	case 1: System.out.println("Automatic redial"); break;
	case 2: System.out.println("Speed dialling"); break;
	case 3: System.out.println("Call waiting options"); break;
	case 4: System.out.println("Own number sending"); break;
	case 5: System.out.println("Phone line in use"); break;
	case 6: System.out.println("Automatic answer"); break;

}

System.out.println("Press 0 to go back");
if (input.nextInt() == 0) {
continue menu;
}
}
	

case 2:
while (true) {
	System.out.println("""

++++++++++++++++++++++++++++++++
	Phone settings:
++++++++++++++++++++++++++++++++

	1 Language 
	2 Cell info display
	3 Welcome note
	4 Network selection	
	5 Lights
	6 Confirm SIM service actions

""");
	
	int phoneSettings = input.nextInt();
	switch (phoneSettings) {

	case 1: System.out.println("Language"); break;
	case 2: System.out.println("Cell info display"); break;
	case 3: System.out.println("welcome note"); break;
	case 4: System.out.println("Network selection"); break;
	case 5: System.out.println("Lights"); break;
	case 6: System.out.println("Confirm SIM service actions"); break;
}

System.out.println("Press 0 to go back");
if (input.nextInt() == 0) {
continue menu;
}
}

	
case 3:	
while (true) {	
	System.out.println("""
  
+++++++++++++++++++++++++++++++++++++++
	Security settings:
+++++++++++++++++++++++++++++++++++++++

	1 PIN code request 
	2 Call barring service
	3 Fixed dialling
	4 Closed user group
	5 Phone security
	6 Change access codes

	""");

	int securitySettings = input.nextInt();
	switch (securitySettings) {
	
	case 1: System.out.println("PIN code request"); break;
	case 2: System.out.println("Call barring service"); break;
	case 3: System.out.println("Fixed dialling"); break;
	case 4: System.out.println("Closed user group"); break;
	case 5: System.out.println("Phone security"); break;
	case 6: System.out.println("Change access codes"); break;
}

System.out.println("Press 0 to go back");
if (input.nextInt() == 0) {
continue menu;
}
}


case 4: System.out.println("Restore factory setting"); break;

}

System.out.println("Press 0 to go back");
if (input.nextInt() == 0) {
continue menu;
}
}

case 7:
	System.out.println("Call divert"); break;
	


case 8: 
	System.out.println("Games"); break;
	


		
case 9: 
	System.out.println("Calculator"); break;
	
case 10: 
	System.out.println("Reminders"); break;
	
case 11:
while (true) { 
	System.out.println("""

++++++++++++++++++++++++++
	Clock:
++++++++++++++++++++++++++


	1 Alarm clock 
	2 Clock settings
	3 Date setting
	4 Stopwatch
	5 Countdown timer
	6 Auto update of date and time

	""");

	int clock = input.nextInt();
	switch (clock) {
	
	case 1: System.out.println("Alarm clock"); break;
	case 2: System.out.println("Clock settings"); break;
	case 3: System.out.println("Date setting"); break;
	case 4: System.out.println("Stopwatch"); break;
	case 5: System.out.println("Countdown timer"); break;
	case 6: System.out.println("Auto update of date and time"); break;
	
}

System.out.println("Press 0 to go back");
if (input.nextInt() == 0) {
continue menu;
}
}

case 12:
	System.out.println("Profiles"); break;
case 13:	{


 
	while (true){	
	System.out.println("""
		View sim services here
	          0 back
	""");

	int simChose = input.nextInt();
	if (simChose == 0) break;

	



}


}

default:
	System.out.println("Invalid Input");

}
 
}
}
}