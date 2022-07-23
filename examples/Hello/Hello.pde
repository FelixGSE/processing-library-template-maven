import template.library.*;

void setup() {
  size(400,400);

  PFont font = createFont("",40);
  textFont(font);
}

void draw() {
  background(0);
  fill(255);
  text(Main.hello(), 40, 200);
}