package org.sdu.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sdu.calc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcButton.setOnClickListener {
            val calc1:Calc =Calc()
            val result1 =calc1.subtract(1,2)
            binding.output.text = "빼기 결과: ${result1}"

            val calc2:Calculator = Calc()
            val result2 = calc2.add(10,10)
            binding.output.append("\n 더하기 결과 ${result2}")

            val calc3 =Calc2()
            val result3 = calc3.add(30,30)
            binding.output.append("\n 더하기 결과 : ${calc3.name} -  ${result3}")


            val calc4 = Calc3()
            val result4 = calc4.subtract(30,10)
            binding.output.append("\n 빼기 결과 : ${calc3.name} -  ${result4}")
        }

        binding.createButton.setOnClickListener {
            val cacl1 =object: Calculator{
                override fun add(a:Int,b:Int):Int{
                    return a+b
                }
            }
            binding.output.text = "인터페이스로부터 객체 만들어짐"
            val res = cacl1.add(20,20)
            binding.output.append("\n 더하기 결과 ${res}")
        }

        binding.createButton2.setOnClickListener {
            val calc2 = object: calcAdapter(){
                override fun subtract(a:Int,b:Int):Int{
                    return  a- b
                }
            }

            val res1 = calc2.subtract(39,10)
            binding.output.text = "추상클래스로부터 객체 만들어짐"
            binding.output.append("\n 빼기 결과 ${res1}")
        }

    }
}