package com.shami

import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class Main: DescribeSpec({
    describe("com.shami.main function testing") {
        context("com.shami.sum test") {
            it("12 + 8 = 20") {
                sum(12, 8) shouldBe 20
            }
            it("11 + 8 = 19") {
                sum(11, 8) shouldBe 19
            }
        }
    }
})
