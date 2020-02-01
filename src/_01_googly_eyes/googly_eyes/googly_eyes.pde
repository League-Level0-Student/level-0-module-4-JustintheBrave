
void setup() {
  size(430, 600);
  PImage face = loadImage("face.jpg");
  background(face);
}

void draw() {

  fill(255, 50, 10);
  ellipse(278, 105, 50, 50);
  ellipse(319, 123, 50, 50);

  if (mouseX>260 && mouseX<290 && mouseY> 90 && mouseY<120) {
    fill(0, 0, 0);
    ellipse(mouseX, mouseY, 25, 25);
    ellipse(mouseX+41, mouseY+18, 25, 25);
  } else {
    fill(0, 0, 0);
    ellipse(278, 105, 25, 25);
    ellipse(319, 123, 25, 25);
  }
}
