package fireDrillTwo;

import java.util.Scanner;

public class NokiaApp3310 {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args){

            mainMenu();

            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->phoneBook();
                case 2->messages();
                case 3->chat();
                case 4->callRegister();
                case 5->tones();
                case 6->settings();
                case 7->callDivert();
                case 8->games();
                case 9->calculator();
                case 10->reminders();
                case 11->clock();
                case 12->profile();
                case 13->simServices();
                case 99 -> System.exit(0);

            }
        }






        public static void mainMenu() {
            System.out.println("""
	1.Phone book
	2.Messages
	3.Chat
	4.Call Register
	5.Tones
	6.Settings
	7.Call Divert
	8.Games
	9.Calculator
	10.Reminders
	11.Clock
	12.Profile
	13.SIM services
	99. Exit""");
        }



        public static void phoneBook() {
            System.out.println("""
	1.Search
	2.Service
	3.Add Name
	4.Erase
	5.Edit
	6.Assign tone
	7.Send B' Card
	8.Options
	9.Speed Dials
	10.Voice Tags
	0. Exit""");


            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->search();
                case 2->service();
                case 3->addName();
                case 4->erase();
                case 5->edit();
                case 6->assignTone();
                case 7->sendBCard();
                case 8->options();
                case 9->speedDials();
                case 10->voiceTags();
                case 0 -> mainMenu();



            }
        }

        public static void options(){
            System.out.println("""
		1. Type Of View
		2. Memory Status

		0. Exit""");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->typeOfView();
                case 2->memoryStatus();
                case 0 -> phoneBook();

            }

        }


        public static void search() {
            System.out.println("0. Exit");


            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch (number){
                case 0: phoneBook();
            }
        }

        public static void service() {
            System.out.println("0. Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneBook();
            }

        }


        public static void addName() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneBook();
            }

        }

        public static void erase() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneBook();

            }
        }

        public static void edit() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneBook();

            }
        }


        public static void assignTone() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                phoneBook();
            }

        }

        public static void sendBCard() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                phoneBook();
            }
        }







        public static void typeOfView() {

            System.out.println("""
	      ***Type Of View***

		0.Exit""");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                options();
            }
        }



        public static void memoryStatus() {
            System.out.println("""
	    ****Memory Status***
		0.Exit""");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                options();

            }

        }


        public static void speedDials() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                phoneBook();
            }
        }

        public static void voiceTags() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                phoneBook();
            }
        }







        public static void messages() {
            System.out.println("""
	1.Write messages
	2.Inbox
	3.Outbox
	4.Picture messages
	5.Templates
	6.Smileys
	7.Messages Setting
	8.Info service
	9.Voice mailbox number
	10.Service command editor
	0. Exit""");


            System.out.println("Enter number: ");
            int number = input.nextInt();
            switch(number){
                case 1->writeMessages();
                case 2->inbox();
                case 3->outbox();
                case 4->pictureMessages();
                case 5->templates();
                case 6->smileys();
                case 7->messagesSetting();
                case 8->infoService();
                case 9->voiceMailboxNumber();
                case 10->serviceCommandEditor();
                case 0->mainMenu();

            }
        }

        public static void messagesSetting(){
            System.out.println("""

		1. set1;
		2. common;
		0. Exit""");



            System.out.println("Enter option: ");

            int number = input.nextInt();
            switch(number){
                case 1->set1();
                case 2->common();
                case 0->messages();

            }
        }








        public static void writeMessages() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                messages();

            }
        }

        public static void inbox() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();


            if(number == 0){
                messages();

            }
        }

        public static void outbox() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                messages();

            }
        }


        public static void pictureMessages() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                messages();

            }
        }

        public static void templates() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                messages();

            }
        }

        public static void smileys() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                messages();
            }
        }


        public static void set1() {
            System.out.println("""
	1.Message centre number
	2.Messages sent as
	3.Message validity
	0. Exit""");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->messageCentreNumber();
                case 2->messagesSentAs();
                case 3->messageValidity();
                case 0->messagesSetting();
            }

        }



        public static void messageCentreNumber() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                set1();

            }
        }

        public static void messagesSentAs() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                set1();

            }
        }

        public static void messageValidity() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                set1();

            }
        }



        public static void common() {
            System.out.println("""
	1.Delivery reports
	2.Reply via same centre
	3.Character support
	0. Exit""");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            switch(number){
                case 1->deliveryReports();
                case 2->replyViaSameCentre();
                case 3->characterSupport();
                case 0->messagesSetting();



            }
        }


        public static void deliveryReports() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                common();
            }
        }

        public static void replyViaSameCentre() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                common();

            }
        }

        public static void characterSupport() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                common();

            }
        }


        public static void infoService() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                messages();

            }
        }

        public static void voiceMailboxNumber() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                messages();

            }
        }

        public static void serviceCommandEditor() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                messages();

            }
        }



        public static void chat(){
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                mainMenu();

            }

        }

        public static void callRegister() {
            System.out.println("""
	1.Missed calls
	2.Received calls
	3.Dialed numbers
	4.Erase recent call lists
	5.Show call duration
	6.Show call costs
	7.call cost settings
	8.Prepaid credit
	0. Exit""");


            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->missedCalls();
                case 2->receivedCalls();
                case 3->dialedNumbers();
                case 4->eraseRecentCallLists();
                case 5->showCallDuration();
                case 6->showCallCosts();
                case 7->callCostSettings();
                case 8->prepaidCredit();
                case 0->mainMenu();
            }
        }

        public static void showCallDuration() {
            System.out.println("""
	1.Last call duration
	2.All calls duration
	3.Received calls duration
	4.Dialed calls duration
	5.Clear timers
	0. Exit""");

            System.out.println("Enter number: ");
            int number7 = input.nextInt();

            switch(number7){
                case 1->lastCallDuration();
                case 2->allCallsDuration();
                case 3->receivedCallsDuration();
                case 4->dialedCallsDuration();
                case 5->clearTimers();
                case 0->callRegister();
            }
        }

        public static void lastCallDuration(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                showCallDuration();
            }
        }

        public static void allCallDuration(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                showCallDuration();
            }
        }

        public static void receivedCallDuration(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                showCallDuration();
            }
        }

        public static void dialedCallsDuration(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                showCallDuration();
            }
        }

        public static void clearTimers(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                showCallDuration();
            }
        }


        public static void showCallCosts() {
            System.out.println("""
	1.Last call cost
	2.All calls cost
	3.Clear counters
	0. Exit""");


            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->lastCallCost();
                case 2->allCallsCost();
                case 3->clearCounters();
                case 0->callRegister();
            }
        }

        public static void lastCallCost(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                showCallCosts();
            }
        }

        public static void allCallCost(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                showCallCosts();
            }
        }

        public static void clearCounter(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                showCallCosts();
            }
        }


        public static void callCostSettings() {
            System.out.println("""
	1.Call cost limit
	2.Show costs in
	0. Exit""");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->callCostLimit();
                case 2->showCostsIn();
                case 0->callRegister();
            }
        }

        public static void CallCostLimit(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callCostSettings();
            }
        }

        public static void showCostIn(){
            System.out.print("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callCostSettings();
            }
        }




        public static void missedCalls() {
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }


        }

        public static void receivedCalls() {
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }

        }

        public static void dialedNumbers() {
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }

        }

        public static void eraseRecentCallLists() {
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }

        }





        public static void allCallsDuration() {
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }

        }

        public static void receivedCallsDuration(){
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }

        }







        public static void allCallsCost() {
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();

            }

        }

        public static void clearCounters() {
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }

        }



        public static void callCostLimit(){
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }
        }

        public static void showCostsIn(){
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();
            }

        }

        public static void prepaidCredit() {
            System.out.println("0.Exit");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callRegister();

            }
        }



        public static void tones() {
            System.out.println("""
	1.Ringing tone
	2.Ringing volume
	3.Incoming call alert
	4.Composer
	5.Message alert tone
	6.Keypad tones
	7.Warning and game tones
	8.Vibration alert
	9.Screen saver
	0. Exit""");


            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->ringingTone();
                case 2->ringingVolume();
                case 3->incomingCallAlert();
                case 4->composer();
                case 5->messagesAlertTone();
                case 6->keypadTones();
                case 7->warningAndGameTones();
                case 8->vibratingAlert();
                case 9->screenSaver();
                case 0->mainMenu();

            }
        }





        public static void ringingTone() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }

        public static void ringingVolume() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }

        public static void incomingCallAlert() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }

        public static void composer() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }

        public static void messagesAlertTone() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }

        public static void keypadTones() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }

        public static void warningAndGameTones() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }

        public static void vibratingAlert() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }

        public static void screenSaver() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                tones();

            }
        }



        public static void settings() {
            System.out.println("""
	1.Call settings
	2.Phone settings
	3.Security settings
	4.Restore factory settings
	0.Exit""");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->callSettings();
                case 2->phoneSettings();
                case 3->securitySettings();
                case 4->restoreFactorySettings();
                case 0->mainMenu();

            }
        }



        public static void callSettings() {
            System.out.println("""
	1.Automatic redial
	2.Speed dialing
	3.Call waiting options
	4.Own number sending
	5.Phone line in use
	6.Automatic answer
	0. Exit""");


            System.out.println("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->automaticRedial();
                case 2->speedDialing();
                case 3->callWaitingOptions();
                case 4->ownNumberSending();
                case 5->phoneLineInUse();
                case 6->automaticAnswer();
                case 0->settings();

            }
        }

        public static void automaticRedial() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callSettings();
            }
        }


        public static void speedDialing() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callSettings();
            }
        }

        public static void callWaitingOptions() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callSettings();
            }
        }

        public static void ownNumberSending() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callSettings();
            }
        }

        public static void phoneLineInUse() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callSettings();
            }
        }

        public static void automaticAnswer() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                callSettings();
            }
        }



        public static void phoneSettings() {
            System.out.println("""
	1.Language
	2.Cell info display
	3.Welcome Notes
	4.Network selection
	5.Lights
	6.Confirm SIM service actions
	0. Exit""");

            System.out.println("Enter option: ");
            int number = input.nextInt();
            switch(number){
                case 1->language();
                case 2->cellInfoDisplay();
                case 3-> welcomeNote();
                case 4->networkSelection();
                case 5->lights();
                case 6->confirmSimServiceActions();
                case 0->settings();
            }
        }

        public static void language() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneSettings();
            }
        }

        public static void cellInfoDisplay() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneSettings();
            }
        }

        public static void welcomeNote(){
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneSettings();
            }
        }

        public static void networkSelection() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneSettings();
            }
        }

        public static void lights() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneSettings();
            }
        }

        public static void confirmSimServiceActions() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                phoneSettings();
            }
        }



        public static void securitySettings() {
            System.out.println("""
	1.Pin code request
	2.Call barring service
	3.Fixed dialing
	4.Closed user group
	5.Phone security
	6.Change access codes
	0. Exit""");

            System.out.print("Enter option: ");
            int number = input.nextInt();

            switch(number){
                case 1->pinCodeRequest();
                case 2->callBarringService();
                case 3->fixedDialing();
                case 4-> closedUserGroup();
                case 5->phoneSecurity();
                case 6->changeAccessCodes();
                case 0->settings();
            }
        }

        public static void pinCodeRequest() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                securitySettings();
            }
        }

        public static void callBarringService() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                securitySettings();
            }
        }




        public static void fixedDialing() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                securitySettings();
            }
        }


        public static void closedUserGroup() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                securitySettings();
            }
        }



        public static void phoneSecurity() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                securitySettings();
            }
        }


        public static void changeAccessCodes() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                securitySettings();
            }
        }




        public static void restoreFactorySettings() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                settings();
            }
        }



        public static void callDivert() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                mainMenu();

            }
        }

        public static void games() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                mainMenu();

            }
        }

        public static void calculator() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                mainMenu();

            }
        }

        public static void reminders() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                mainMenu();

            }
        }



        public static void clock() {
            System.out.println("""
	1.Alarm clock
	2.Clock settings
	3.Date settings
	4.StopWatch
	5.Countdown timer
	6.Auto update of date and time
	0. Exit""");


            System.out.println("Enter option:");
            int number = input.nextInt();

            switch(number){
                case 1->alarmClock();
                case 2->clockSettings();
                case 3->dateSettings();
                case 4->stopWatch();
                case 5->countdownTimer();
                case 6-> autoUpdateOfDateAndTime();
                case 0->mainMenu();
            }
        }


        public static void alarmClock() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                clock();
            }
        }

        public static void clockSettings() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                clock();
            }
        }

        public static void dateSettings() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                clock();
            }
        }

        public static void stopWatch() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                clock();
            }
        }

        public static void countdownTimer() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                clock();
            }
        }

        public static void autoUpdateOfDateAndTime() {
            System.out.println("0.Exit");

            System.out.println("Enter option: ");
            int number = input.nextInt();

            if(number == 0){
                clock();
            }
        }


        public static void profile() {
            System.out.println("0. Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number == 0){
                mainMenu();

            }
        }



        public static void simServices() {
            System.out.println("0.Exit");

            System.out.println("Enter number: ");
            int number = input.nextInt();

            switch (number){
                case 0: mainMenu();

            }

        }

        public void displayMainMenu(){

        }

    }


