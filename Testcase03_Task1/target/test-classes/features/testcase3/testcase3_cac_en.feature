@testcase3_cac_en
Feature: practice

  Scenario Outline: Check Infomation LG
    Given Auto open url <url>
    When Add "<product>" To Cart And Go To Cart
    When Get Infomation In Cart
    When Enter Information In Check Out Page
    When Get Infomation In CheckOut
    Then Compare Price And Qty
    When Select Payment Method

    Examples:
      | url                                                             | product    |
      | https://wwwstg.lg.com/cac_en/shop/addtocartsimulator/page/index | MD05849136 |