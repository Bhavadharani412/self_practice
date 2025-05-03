use std::io;
fn main() {
    println!("Enter a number");
    let mut number: String = String::new();
    io::stdin().read_line(&mut number).expect("Failed to read input");
    let mut num1: i32 = number.trim().parse().expect("Please enter a valid number");
    let mut sum : i32 = 0;
    while num1 != 0{
        sum += num1 % 10;
        num1 /= 10;
    }
    println!("The sum of the digits is {}",sum);
}
