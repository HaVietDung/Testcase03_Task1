@testcase3_vn
Feature: practice

  Scenario Outline: Check Infomation LG
    Given Auto open url <url>
    When Add product "<product>" To Cart And Go To Cart
    When Get Infomation In Cart
    When Enter Information In Check Out Page "<country>"
    When Get Infomation In CheckOut
    Then Compare Price And Qty
    When Select Payment Method

    Examples:
      | url                                                         | product    | country |
      | https://wwwstg.lg.com/vn/shop/addtocartsimulator/page/index | MD05849136 | vn      |

