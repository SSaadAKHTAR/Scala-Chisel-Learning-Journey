package Lab3


import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Task1bTester extends FreeSpec with ChiselScalatestTester {
  "Branch Tester file" in {
    test(new BranchControl){b =>
        b.io.fnct3.poke("b110".U)
       b.io.arg_x.poke(5.U)
       b.io.arg_y.poke(5.U)
       b.io.branch.poke(1.B)
       b.io.br_taken.expect(0.B)
       b.clock.step(10)

    }
  }
}
