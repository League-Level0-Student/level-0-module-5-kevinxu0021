  int Y = 10;
  int X = (int)random(1920);
  int score = 0;
void setup(){
 size(1920, 965);
  
  
  
  
  
  
  
  
}
void draw(){
  background(255, 255, 255);
  fill(162, 255, 255);
  ellipse(X, Y, 10,10);
  noStroke();
  fill(116, 118, 118);
  rect(mouseX, 865, 50, 100);
  Y+=3;
  fill(0,0,0);
  textSize(16);
  text("Score: " + score, 20, 20);
  
  if(Y >= 965 ){
    checkCatch(X);
   Y = 10; 
   if(score >= 1){
    Y=0;
    text("You Won!", 960, 483);
    textSize(20);
  }else{
   X = (int)random(1920);
  }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
void checkCatch(int x){
if (x > mouseX && x < mouseX+50)
      score++;
   else if (score > 0)
     score--;
println("Your score is now: " + score);
}