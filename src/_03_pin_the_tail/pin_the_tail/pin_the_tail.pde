PImage shrek;
PImage tail;
int tailX = 1000;
int tailY = 10000;

    import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

void setup() {
 shrek = loadImage("shrek.jpg"); 
 tail = loadImage("tail.png");
 tail.resize(200,100);
 size(480,360);
}

void draw() {
  image(shrek,0,0);
  println("X: " + mouseX + " Y: " + mouseY); 
  
  if(mousePressed){
  if(mouseX>=345 && mouseX<=364 && mouseY<=241 && mouseY>=211) {
    tailX=276;
    tailY=211;


Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
  }
  }
  image(tail,tailX,tailY);
}
