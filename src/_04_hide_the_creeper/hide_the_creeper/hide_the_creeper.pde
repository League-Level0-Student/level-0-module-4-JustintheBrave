PImage greenboi;
PImage creeper;
int creeperX = 20;
int creeperY = 40;

void setup() {
  greenboi = loadImage("minecraft.png");
  size(800,500);
  greenboi.resize(800,500);
  
  creeper = loadImage("creeper.png");
  creeper.resize(70,70);
}

void draw() {
  background(greenboi);
  image(creeper,creeperX,creeperY);
  println(mouseX,mouseY);
  if(mousePressed){
    fill(255,0,0);
   ellipse(mouseX,mouseY,20,20); 
  }
  
  if(mousePressed) {
  if(mouseX>=20 && mouseX<=100 && mouseY>=48 && mouseY<=116) {
   fill(0,255,0); 
   ellipse(mouseX,mouseY,20,20);
  }
  }
}
