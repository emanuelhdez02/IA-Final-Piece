public class QuestionGroup {
    public Question[] easy = new Question[10];
    public Question[] med = new Question[10];
    public Question[] hard = new Question[10];
    int gameLength = 10;
    boolean lastQuestionCorrect = false;
    int lastQuestionDifficulty = 1;

    public QuestionGroup() {
        createEasy();
        createMedium();
        createHard();
        //determineQuestion();
    }

    void createEasy() {
        easy[0] = new Question("Who won the NBA championship in 2018? 1.Celtics 2.Warriors 3.Caverliers 4.Rockets", 2,  1);
        easy[1] = new Question("Who won the NL MLB MVP in 2018? 1.Christian Yelich 2.Javier Baez 3.Nolan Arenado 4.Jacob Degrom", 1,  1);
        easy[2] = new Question("Who set the record for the fastest 100m recently? 1.Maurice Greene 2.Donovan Bailey 3.Asafa Powell 4.Usain Bolt", 4,  1);
        easy[3] = new Question("Who has the highest career points in the NBA? 1.Michael Jordan 2.Kareem Abdul-Jabbar 3.Wilt Chamberlain 4.Lebron James", 2,  1);
        easy[4] = new Question("What college does Zion Williamson attend? 1.Kentucky 2.Gonzaga 3.UNC 4.Duke", 4,  1);
        easy[5] = new Question("Who won the Super Bowl in 2019? 1.Patriots 2.Eagles 3.Rams 4.Saints", 1,  1);
        easy[6] = new Question("Who won the NHL playoffs in 2018 1.Golden Knights 2.Lightning 3.Sharks 4.Capitals", 4,  1);
        easy[7] = new Question("From 2010-18 how many World Series have the Giants won? 1)4 2)1 3)2 4)3", 4,  1);
        easy[8] = new Question("Who did the Raiders recently trade for? 1.Antonio Brown 2.Odell Beckham Jr 3.Julio Jones 4.Juju Smith", 1,  1);
        easy[9] = new Question("Who was drafted first in the 2018 NBA draft? 1.Marvin Bagley 2.Markelle Fultz 3.Deandre Ayton 4.Luka Doncic", 3,  1);

    }

    void createMedium() {
        med[0] = new Question("Which player was the MVP of the 2014 NBA Finals? 1.Lebron James 2.Tim Duncan 3.Kawhi Leonard 4.Tony Parker", 3,  2);
        med[1] = new Question("How many total World Series wins do the Yankees have? 1)27 2)25 3)29 4)26", 1,  2);
        med[2] = new Question("The number 2 refers to what position in Baseball? 1.Left Field 2.First Base 3.Shortstop 4.Catcher", 4,  2);
        med[3] = new Question("How many World Series wins do the Padres have? 1)0 2)3 3)4 4)1", 1,  2);
        med[4] = new Question("Which city hosted the 1992 Summer Olympic Games? 1.Beijing 2.Rio 3.Barcelona 4.USA", 3,  2);
        med[5] = new Question("He is the youngest NBA player to score 10,000 points. 1.Lebron James 2.Kobe Bryant 3.Michael Jordan 4.Kareem Abdul-Jabbar", 2,  2);
        med[6] = new Question("What pitcher holds the record for most complete games in an MLB career? 1.Nolan Ryan 2.Don Sutton 3.CY Young 4.Roy Halladay", 3,  2);
        med[7] = new Question("Who was the last player to get a triple crown HR/RBI/AVG? 1.Mike Trout 2.Miguel Cabrera 3.Bryce Harper 4.Buster Posey", 2,  2);
        med[8] = new Question("What is the record for most red cards given in a game? 1)36 2)12 3)24 4)6", 1,  2);
        med[9] = new Question(" What manager led the Boston Red Sox to their first championship in 86 years? 1.John Farrel 2.Dick Williams 3.Bobby Valentine 4.Terry Francona", 4,  2);

    }

    void createHard() {
        hard[0] = new Question("Who was not part of the 1996 dream team? 1.John Stockton 2.Michael Jordan 3.Gary Payton 4.Anfernee Hardaway", 2,  3);
        hard[1] = new Question("What is the diameter of the basketball hoop in inches? 1)18 in 2)16 in 3)20 in 4)14 in", 1,  3);
        hard[2] = new Question("Why was there no baseball World Series in the year 1994? 1.Terrorist attack 2.Not Enough Players 3.Strikes from players 4.Injuries", 3,  3);
        hard[3] = new Question("Who has the most appearances in the World Cup 1.Brazil 2.Italy 3.Argentina 4.Germany", 1, 3);
        hard[4] = new Question("In which year was the first ever Wimbledon tennis tournament held? 1)1883 2)1871 3)1905 4)1877", 4,  3);
        hard[5] = new Question("Name the coach who has won both titles of Rose Bowl and Super Bowl? 1.Jim Harbaugh 2.Dick Vermeil 3.Pete Carroll 4.Nick Saban", 2,  3);
        hard[6] = new Question("Which team won the 1981 World Series 1.Yankees 2.Phillies 3.Expos 4.Dodgers", 4,  3);
        hard[7] = new Question("Who won the AL MVP in 2002? 1)Alex Rodriguez 2)Manny Ramirez 3)Miguel Tejada 4)Jim Thome", 3,  3);
        hard[8] = new Question("Who finished in 4th place for the Men's 100m in the London Olympics? 1)Tyson Gay 2)Ryan Bailey 3)Richard Thompson 4)Justin Gatlin", 1,  3);
        hard[9] = new Question("Who led the league in interceptions in 1997? 1)Keith Lyle 2)Tyrone Braxton 3)Orlando Thomas 4)Ryan McNeil", 4,  3);
    }

    Question determineQuestion() {
        //for (int i = 0; i < gameLength; i++) {
            if (lastQuestionCorrect == false && lastQuestionDifficulty == 1) {
            return getNextOfType(1);
            // return next easy question
            }
            if (lastQuestionCorrect == true && lastQuestionDifficulty == 1) {
                return getNextOfType(2);
                // return next medium question
            }

            if (lastQuestionCorrect == true && lastQuestionDifficulty == 2) {

                return getNextOfType(3);
                // return next hard question
            }
            if (lastQuestionCorrect == false && lastQuestionDifficulty == 2) {
                return getNextOfType(1);
                // return next easy question
            }
            if (lastQuestionCorrect == true && lastQuestionDifficulty == 3) {
                return getNextOfType(3);
                // return next hard question
            }
            if (lastQuestionCorrect == false && lastQuestionDifficulty == 3) {
                return getNextOfType(2);
                // return next medium question
            }
        //}
    return easy[0];
    }



    Question getNextOfType(int type) {

        if (type == 1) {
            for (int i = 0; i < easy.length; i++) {
                if (easy[i].answeredCorrectly == 0) {
                    return easy[i];
                }
            }
        }
        if (type == 2) {
            for (int i = 0; i < med.length; i++) {
                if (med[i].answeredCorrectly == 0) {
                    return med[i];
                }
            }
        }

        if (type == 3) {
            for (int i = 0; i < hard.length; i++) {
                if (hard[i].answeredCorrectly == 0) {
                    return hard[i];
                }
            }
        }
    return med[0];
    }
    void computeResult(){
        int easyCorrect = 0;
        int medCorrect = 0;
        int hardCorrect = 0;
        for(int i=0; i < easy.length; i++){
            if(easy[i].answeredCorrectly == 2){
                easyCorrect++;
            }
        }
        for(int i = 0; i < med.length; i++){
            if(med[i].answeredCorrectly == 2){
                medCorrect += 2;
            }
        }
        for(int i = 0; i < hard.length; i++){
            if(hard[i].answeredCorrectly == 2){
                hardCorrect += 3;
            }
        }
        int score = easyCorrect + medCorrect + hardCorrect;

        if (score == 27){
            System.out.println("You know your sports when you're with friends you know what they are always talking about. Your IQ is the highest it can ever be. Your knowledge on sports is even more superior of that of someone who plays the sport. Great Job!!!");
        }
        if(score >= 18 && score < 27){
            System.out.println("You have knowledge over some sports of course you got some wrong but when it comes down to it all you know what is being talked about when sports category comes up in your life. Good Job!!");
        }
        if (score >= 9 && score < 18){
            System.out.println("You have somewhat an idea of what is being said but at times you are confused with what is being said at the time so you sometimes have a hard time. Ok but not impressive");
        }
        if (score >= 1 && score < 9){
            System.out.println("You either know just a little of what is asked or you've been living under a rock for the past few decades or so. Bad Job");
        }
        if (score == 0){
            System.out.println("You obviously didn't even look at the quiz or knew what was going on. NOO GOOD!");
        }

    }

}

