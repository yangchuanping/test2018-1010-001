<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>广西桂林创业科技园</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/BackPage/img/logo2.png" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/BackPage/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/BackPage/css/font-awesome.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/BackPage/css/custom.min.css" />
	</head>
	<body class="nav-md">
		<div class="container body">
			<div class="main_container">
				<div class="col-md-3 left_col">
					<div class="left_col scroll-view">
						<div class="navbar nav_title" style="border: 0;">
							<a href="${pageContext.request.contextPath}/BackPage/index.jsp" class="site_title"><img class="img" src="${pageContext.request.contextPath}/BackPage/img/logo1.png"/><span>科技园后台系统</span></a>
						</div>

						<div class="clearfix"></div>

						<!-- 侧边菜单顶部信息-->
						<div class="profile" style="margin-bottom: 70px;">
							<div class="profile_pic">
								<img src="${pageContext.request.contextPath}/BackPage/img/img.jpg" alt="..." class="img-circle profile_img">
							</div>
							<div class="profile_info">
								<span>欢迎!</span>
								<h2 id="log_h2">用户管理员</h2>
							</div>
						</div>
						<!-- 侧边菜单顶部信息结束-->

						<br />

						<!--侧边栏菜单开始 -->
						<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
							<div class="menu_section">
								<!--<h3>菜单</h3>-->
								<ul class="nav side-menu">
									<li>
										<a><i class="fa fa-home"></i> 首页 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/index.jsp">系统首页</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-edit"></i> 企业管理 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/company_information.jsp">企业信息</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/company_house_information.jsp">企业租房信息</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/company_apply_expand.jsp">企业扩展申请处理</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/company_quit_apply.jsp">退园申请处理</a>
											</li>
											<li>
												<a href="javascript:;">企业报送</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-institution"></i> 物业管理 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/house_msg_edit.jsp">房屋信息编辑</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/house_details.jsp">房屋出租情况</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/house_service.jsp">房屋维修申请</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-handshake-o"></i>  招商引资 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/garden_in_apply_mag.jsp">入园申请处理</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-folder-open-o"></i> 文件收发 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/file_send-receive.jsp">文件收发</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-envelope-open-o"></i> 短信发送 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/message_send.jsp">短信收发</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-bolt"></i> 水电管理 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/wp_water_mag.jsp">水费管理</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/wp_power_mag.jsp">电费管理</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-file-code-o"></i> 前台信息功能编辑 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/front_swiper_mag.jsp">轮播图设置</a>
											</li>
											<li>
												<a href="javascript:;">园区概况</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/front_news_mag.jsp">园区资讯</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/front_InCompany_mag.jsp">入驻企业</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/front_LeaveWords_mag.jsp">留言管理</a>
											</li>
											<!-- <li>
												<a href="javascript:;">联系我们</a>
											</li> -->
										</ul>
									</li>
									<li>
										<a><i class="fa fa-cog"></i> 系统设置 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/system_account_options.jsp">账户管理</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/system_department_options.jsp">部门管理</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/system_house_options.jsp">园区楼宇设置</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/system_flow_options.jsp">审批流程设置</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-bar-chart"></i> 数据统计 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="javascript:;">数据统计</a>
											</li>
											<li>
												<a href="javascript:;">日志查询</a>
											</li>
										</ul>
									</li>
								</ul>
							</div>
						</div>
						<!-- 侧边菜单结束 -->
					</div>
				</div>

				<!--顶部导航开始 -->
				<div class="top_nav">
					<div class="nav_menu">
						<nav>
							<div class="nav toggle">
								<a id="menu_toggle"><i class="fa fa-bars"></i></a>
							</div>

							<ul class="nav navbar-nav navbar-right">
								<li class="">
									<a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
										<img src="${pageContext.request.contextPath}/BackPage/img/img.jpg" alt=""><span id="log_span"></span>
										<span class=" fa fa-angle-down"></span>
									</a>
									<ul class="dropdown-menu dropdown-usermenu pull-right">
										<!-- <li>
											<a href="javascript:;">简介</a>
										</li>
										<li>
											<a href="javascript:;">
												<span class="badge bg-red pull-right">50%</span>
												<span>设置</span>
											</a>
										</li>
										<li>
											<a href="javascript:;">帮助</a>
										</li> -->
										<li>
											<a href="#" onclick="Logout()"><i class="fa fa-sign-out pull-right"></i>退出</a>
										</li>
									</ul>
								</li>

								<%-- <li role="presentation" class="dropdown">
									<a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
										<i class="fa fa-envelope-o"></i>
										<span class="badge bg-green">6</span>
									</a>
									<ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
										<li>
											<a>
												<span class="image"><img src="${pageContext.request.contextPath}/BackPage/img/img.jpg" alt="Profile Image" /></span>
												<span>
                          <span>John Smith</span>
												<span class="time">3 mins ago</span>
												</span>
												<span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
											</a>
										</li>
										<li>
											<div class="text-center">
												<a>
													<strong>查看全部</strong>
													<i class="fa fa-angle-right"></i>
												</a>
											</div>
										</li>
									</ul>
								</li> --%>
							</ul>
						</nav>
					</div>
				</div>
				<!-- 顶部导航结束 -->
				<!-- 页面内容开始 -->
        		<div class="right_col" role="main">
        			        			<div class="">
			            <div class="page-title">
			              <div class="title_left">
			                <h3>Echarts <small>Some examples to get you started</small></h3>
			              </div>
			
			              <div class="title_right">
			                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
			                  <div class="input-group">
			                    <input type="text" class="form-control" placeholder="Search for...">
			                    <span class="input-group-btn">
			                      <button class="btn btn-default" type="button">Go!</button>
			                    </span>
			                  </div>
			                </div>
			              </div>
			            </div>
			            
			            <div class="clearfix"></div>
			
			            <div class="row">
			              <div class="col-md-8 col-sm-8 col-xs-12">
			                <div class="x_panel">
			                  <div class="x_title">
			                    <h2>Bar Graph</h2>
			                    <ul class="nav navbar-right panel_toolbox">
			                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
			                      </li>
			                      <li class="dropdown">
			                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
			                        <ul class="dropdown-menu" role="menu">
			                          <li><a href="#">Settings 1</a>
			                          </li>
			                          <li><a href="#">Settings 2</a>
			                          </li>
			                        </ul>
			                      </li>
			                      <li><a class="close-link"><i class="fa fa-close"></i></a>
			                      </li>
			                    </ul>
			                    <div class="clearfix"></div>
			                  </div>
			                  <div class="x_content">
			
			                    <div id="mainb" style="height:350px;"></div>
			
			                  </div>
			                </div>
			              </div>
			
			              <div class="col-md-4 col-sm-4 col-xs-12">
			                <div class="x_panel">
			                  <div class="x_title">
			                    <h2>Mini Pie</h2>
			                    <ul class="nav navbar-right panel_toolbox">
			                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
			                      </li>
			                      <li class="dropdown">
			                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
			                        <ul class="dropdown-menu" role="menu">
			                          <li><a href="#">Settings 1</a>
			                          </li>
			                          <li><a href="#">Settings 2</a>
			                          </li>
			                        </ul>
			                      </li>
			                      <li><a class="close-link"><i class="fa fa-close"></i></a>
			                      </li>
			                    </ul>
			                    <div class="clearfix"></div>
			                  </div>
			                  <div class="x_content">
			
			                    <div id="echart_mini_pie" style="height:350px;"></div>
			
			                  </div>
			                </div>
			              </div>
			
			
			              <div class="col-md-4 col-sm-4 col-xs-12">
			                <div class="x_panel">
			                  <div class="x_title">
			                    <h2>Pie Graph</h2>
			                    <ul class="nav navbar-right panel_toolbox">
			                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
			                      </li>
			                      <li class="dropdown">
			                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
			                        <ul class="dropdown-menu" role="menu">
			                          <li><a href="#">Settings 1</a>
			                          </li>
			                          <li><a href="#">Settings 2</a>
			                          </li>
			                        </ul>
			                      </li>
			                      <li><a class="close-link"><i class="fa fa-close"></i></a>
			                      </li>
			                    </ul>
			                    <div class="clearfix"></div>
			                  </div>
			                  <div class="x_content">
			
			                    <div id="echart_pie" style="height:350px;"></div>
			
			                  </div>
			                </div>
			              </div>
			
			              <div class="col-md-4 col-sm-4 col-xs-12">
			                <div class="x_panel">
			                  <div class="x_title">
			                    <h2>Pie Area</h2>
			                    <ul class="nav navbar-right panel_toolbox">
			                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
			                      </li>
			                      <li class="dropdown">
			                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
			                        <ul class="dropdown-menu" role="menu">
			                          <li><a href="#">Settings 1</a>
			                          </li>
			                          <li><a href="#">Settings 2</a>
			                          </li>
			                        </ul>
			                      </li>
			                      <li><a class="close-link"><i class="fa fa-close"></i></a>
			                      </li>
			                    </ul>
			                    <div class="clearfix"></div>
			                  </div>
			                  <div class="x_content">
			
			                    <div id="echart_pie2" style="height:350px;"></div>
			
			                  </div>
			                </div>
			              </div>
			
			              <div class="col-md-4 col-sm-4 col-xs-12">
			                <div class="x_panel">
			                  <div class="x_title">
			                    <h2>Donut Graph</h2>
			                    <ul class="nav navbar-right panel_toolbox">
			                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
			                      </li>
			                      <li class="dropdown">
			                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
			                        <ul class="dropdown-menu" role="menu">
			                          <li><a href="#">Settings 1</a>
			                          </li>
			                          <li><a href="#">Settings 2</a>
			                          </li>
			                        </ul>
			                      </li>
			                      <li><a class="close-link"><i class="fa fa-close"></i></a>
			                      </li>
			                    </ul>
			                    <div class="clearfix"></div>
			                  </div>
			                  <div class="x_content">
			
			                    <div id="echart_donut" style="height:350px;"></div>
			
			                  </div>
			                </div>
			              </div>												
			            </div>
    				</div>
        		</div>
        		<!-- 内容结束结束 -->
        		<!-- 页脚内容开始-->
		        <footer>
		          <div class="pull-right">
		                              中国桂林留学人员创业园，桂林科技企业发展中心
		          <!--  <a href="https://colorlib.com">官网链接</a>-->
		          </div>
		          <div class="clearfix"></div>
		        </footer>
		        <!-- 页脚内容结束 -->

			</div>
		</div>
		<script src="${pageContext.request.contextPath}/BackPage/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/BackPage/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/BackPage/js/custom.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/BackPage/js/operatcookie.js"></script>
		<script src="${pageContext.request.contextPath}/BackPage/js/item/general.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/BackPage/js/echarts/echarts.min.js" type="text/javascript"></script>
		<script type="text/javascript">
			var theme = {
	          color: [
	              '#26B99A', '#34495E', '#BDC3C7', '#3498DB',
	              '#9B59B6', '#8abb6f', '#759c6a', '#bfd3b7'
	          ],
	
	          title: {
	              itemGap: 8,
	              textStyle: {
	                  fontWeight: 'normal',
	                  color: '#408829'
	              }
	          },
	
	          dataRange: {
	              color: ['#1f610a', '#97b58d']
	          },
	
	          toolbox: {
	              color: ['#408829', '#408829', '#408829', '#408829']
	          },
	
	          tooltip: {
	              backgroundColor: 'rgba(0,0,0,0.5)',
	              axisPointer: {
	                  type: 'line',
	                  lineStyle: {
	                      color: '#408829',
	                      type: 'dashed'
	                  },
	                  crossStyle: {
	                      color: '#408829'
	                  },
	                  shadowStyle: {
	                      color: 'rgba(200,200,200,0.3)'
	                  }
	              }
	          },
	
	          dataZoom: {
	              dataBackgroundColor: '#eee',
	              fillerColor: 'rgba(64,136,41,0.2)',
	              handleColor: '#408829'
	          },
	          grid: {
	              borderWidth: 0
	          },
	
	          categoryAxis: {
	              axisLine: {
	                  lineStyle: {
	                      color: '#408829'
	                  }
	              },
	              splitLine: {
	                  lineStyle: {
	                      color: ['#eee']
	                  }
	              }
	          },
	
	          valueAxis: {
	              axisLine: {
	                  lineStyle: {
	                      color: '#408829'
	                  }
	              },
	              splitArea: {
	                  show: true,
	                  areaStyle: {
	                      color: ['rgba(250,250,250,0.1)', 'rgba(200,200,200,0.1)']
	                  }
	              },
	              splitLine: {
	                  lineStyle: {
	                      color: ['#eee']
	                  }
	              }
	          },
	          timeline: {
	              lineStyle: {
	                  color: '#408829'
	              },
	              controlStyle: {
	                  normal: {color: '#408829'},
	                  emphasis: {color: '#408829'}
	              }
	          },
	
	          k: {
	              itemStyle: {
	                  normal: {
	                      color: '#68a54a',
	                      color0: '#a9cba2',
	                      lineStyle: {
	                          width: 1,
	                          color: '#408829',
	                          color0: '#86b379'
	                      }
	                  }
	              }
	          },
	          map: {
	              itemStyle: {
	                  normal: {
	                      areaStyle: {
	                          color: '#ddd'
	                      },
	                      label: {
	                          textStyle: {
	                              color: '#c12e34'
	                          }
	                      }
	                  },
	                  emphasis: {
	                      areaStyle: {
	                          color: '#99d2dd'
	                      },
	                      label: {
	                          textStyle: {
	                              color: '#c12e34'
	                          }
	                      }
	                  }
	              }
	          },
	          force: {
	              itemStyle: {
	                  normal: {
	                      linkStyle: {
	                          strokeColor: '#408829'
	                      }
	                  }
	              }
	          },
	          chord: {
	              padding: 4,
	              itemStyle: {
	                  normal: {
	                      lineStyle: {
	                          width: 1,
	                          color: 'rgba(128, 128, 128, 0.5)'
	                      },
	                      chordStyle: {
	                          lineStyle: {
	                              width: 1,
	                              color: 'rgba(128, 128, 128, 0.5)'
	                          }
	                      }
	                  },
	                  emphasis: {
	                      lineStyle: {
	                          width: 1,
	                          color: 'rgba(128, 128, 128, 0.5)'
	                      },
	                      chordStyle: {
	                          lineStyle: {
	                              width: 1,
	                              color: 'rgba(128, 128, 128, 0.5)'
	                          }
	                      }
	                  }
	              }
	          },
	          gauge: {
	              startAngle: 225,
	              endAngle: -45,
	              axisLine: {
	                  show: true,
	                  lineStyle: {
	                      color: [[0.2, '#86b379'], [0.8, '#68a54a'], [1, '#408829']],
	                      width: 8
	                  }
	              },
	              axisTick: {
	                  splitNumber: 10,
	                  length: 12,
	                  lineStyle: {
	                      color: 'auto'
	                  }
	              },
	              axisLabel: {
	                  textStyle: {
	                      color: 'auto'
	                  }
	              },
	              splitLine: {
	                  length: 18,
	                  lineStyle: {
	                      color: 'auto'
	                  }
	              },
	              pointer: {
	                  length: '90%',
	                  color: 'auto'
	              },
	              title: {
	                  textStyle: {
	                      color: '#333'
	                  }
	              },
	              detail: {
	                  textStyle: {
	                      color: 'auto'
	                  }
	              }
	          },
	          textStyle: {
	              fontFamily: 'Arial, Verdana, sans-serif'
	          }
	      };
	
	      var echartBar = echarts.init(document.getElementById('mainb'), theme);
	
	      echartBar.setOption({
	        title: {
	          text: 'Graph title',
	          subtext: 'Graph Sub-text'
	        },
	        tooltip: {
	          trigger: 'axis'
	        },
	        legend: {
	          data: ['sales', 'purchases']
	        },
	        toolbox: {
	          show: false
	        },
	        calculable: false,
	        xAxis: [{
	          type: 'category',
	          data: ['1?', '2?', '3?', '4?', '5?', '6?', '7?', '8?', '9?', '10?', '11?', '12?']
	        }],
	        yAxis: [{
	          type: 'value'
	        }],
	        series: [{
	          name: 'sales',
	          type: 'bar',
	          data: [2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],
	          markPoint: {
	            data: [{
	              type: 'max',
	              name: '???'
	            }, {
	              type: 'min',
	              name: '???'
	            }]
	          },
	          markLine: {
	            data: [{
	              type: 'average',
	              name: '???'
	            }]
	          }
	        }, {
	          name: 'purchases',
	          type: 'bar',
	          data: [2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],
	          markPoint: {
	            data: [{
	              name: 'sales',
	              value: 182.2,
	              xAxis: 7,
	              yAxis: 183,
	            }, {
	              name: 'purchases',
	              value: 2.3,
	              xAxis: 11,
	              yAxis: 3
	            }]
	          },
	          markLine: {
	            data: [{
	              type: 'average',
	              name: '???'
	            }]
	          }
	        }]
	      });
	     
	      var echartPieCollapse = echarts.init(document.getElementById('echart_pie2'), theme);
	      
	      echartPieCollapse.setOption({
	        tooltip: {
	          trigger: 'item',
	          formatter: "{a} <br/>{b} : {c} ({d}%)"
	        },
	        legend: {
	          x: 'center',
	          y: 'bottom',
	          data: ['rose1', 'rose2', 'rose3', 'rose4', 'rose5', 'rose6']
	        },
	        toolbox: {
	          show: true,
	          feature: {
	            magicType: {
	              show: true,
	              type: ['pie', 'funnel']
	            },
	            restore: {
	              show: true,
	              title: "Restore"
	            },
	            saveAsImage: {
	              show: true,
	              title: "Save Image"
	            }
	          }
	        },
	        calculable: true,
	        series: [{
	          name: 'Area Mode',
	          type: 'pie',
	          radius: [25, 90],
	          center: ['50%', 170],
	          roseType: 'area',
	          x: '50%',
	          max: 40,
	          sort: 'ascending',
	          data: [{
	            value: 10,
	            name: 'rose1'
	          }, {
	            value: 5,
	            name: 'rose2'
	          }, {
	            value: 15,
	            name: 'rose3'
	          }, {
	            value: 25,
	            name: 'rose4'
	          }, {
	            value: 20,
	            name: 'rose5'
	          }, {
	            value: 35,
	            name: 'rose6'
	          }]
	        }]
	      });
	
	      var echartDonut = echarts.init(document.getElementById('echart_donut'), theme);
	      
	      echartDonut.setOption({
	        tooltip: {
	          trigger: 'item',
	          formatter: "{a} <br/>{b} : {c} ({d}%)"
	        },
	        calculable: true,
	        legend: {
	          x: 'center',
	          y: 'bottom',
	          data: ['Direct Access', 'E-mail Marketing', 'Union Ad', 'Video Ads', 'Search Engine']
	        },
	        toolbox: {
	          show: true,
	          feature: {
	            magicType: {
	              show: true,
	              type: ['pie', 'funnel'],
	              option: {
	                funnel: {
	                  x: '25%',
	                  width: '50%',
	                  funnelAlign: 'center',
	                  max: 1548
	                }
	              }
	            },
	            restore: {
	              show: true,
	              title: "Restore"
	            },
	            saveAsImage: {
	              show: true,
	              title: "Save Image"
	            }
	          }
	        },
	        series: [{
	          name: 'Access to the resource',
	          type: 'pie',
	          radius: ['35%', '55%'],
	          itemStyle: {
	            normal: {
	              label: {
	                show: true
	              },
	              labelLine: {
	                show: true
	              }
	            },
	            emphasis: {
	              label: {
	                show: true,
	                position: 'center',
	                textStyle: {
	                  fontSize: '14',
	                  fontWeight: 'normal'
	                }
	              }
	            }
	          },
	          data: [{
	            value: 335,
	            name: 'Direct Access'
	          }, {
	            value: 310,
	            name: 'E-mail Marketing'
	          }, {
	            value: 234,
	            name: 'Union Ad'
	          }, {
	            value: 135,
	            name: 'Video Ads'
	          }, {
	            value: 1548,
	            name: 'Search Engine'
	          }]
	        }]
	      });
	
	      var echartPie = echarts.init(document.getElementById('echart_pie'), theme);
	
	      echartPie.setOption({
	        tooltip: {
	          trigger: 'item',
	          formatter: "{a} <br/>{b} : {c} ({d}%)"
	        },
	        legend: {
	          x: 'center',
	          y: 'bottom',
	          data: ['Direct Access', 'E-mail Marketing', 'Union Ad', 'Video Ads', 'Search Engine']
	        },
	        toolbox: {
	          show: true,
	          feature: {
	            magicType: {
	              show: true,
	              type: ['pie', 'funnel'],
	              option: {
	                funnel: {
	                  x: '25%',
	                  width: '50%',
	                  funnelAlign: 'left',
	                  max: 1548
	                }
	              }
	            },
	            restore: {
	              show: true,
	              title: "Restore"
	            },
	            saveAsImage: {
	              show: true,
	              title: "Save Image"
	            }
	          }
	        },
	        calculable: true,
	        series: [{
	          name: '访问来源',
	          type: 'pie',
	          radius: '55%',
	          center: ['50%', '48%'],
	          data: [{
	            value: 335,
	            name: 'Direct Access'
	          }, {
	            value: 310,
	            name: 'E-mail Marketing'
	          }, {
	            value: 234,
	            name: 'Union Ad'
	          }, {
	            value: 135,
	            name: 'Video Ads'
	          }, {
	            value: 1548,
	            name: 'Search Engine'
	          }]
	        }]
	      });
	
	      var dataStyle = {
	        normal: {
	          label: {
	            show: false
	          },
	          labelLine: {
	            show: false
	          }
	        }
	      };
	
	      var placeHolderStyle = {
	        normal: {
	          color: 'rgba(0,0,0,0)',
	          label: {
	            show: false
	          },
	          labelLine: {
	            show: false
	          }
	        },
	        emphasis: {
	          color: 'rgba(0,0,0,0)'
	        }
	      };
	
	      var echartMiniPie = echarts.init(document.getElementById('echart_mini_pie'), theme);
	
	      echartMiniPie .setOption({
	        title: {
	          text: 'Chart #2',
	          subtext: 'From ExcelHome',
	          sublink: 'http://e.weibo.com/1341556070/AhQXtjbqh',
	          x: 'center',
	          y: 'center',
	          itemGap: 20,
	          textStyle: {
	            color: 'rgba(30,144,255,0.8)',
	            fontFamily: '微软雅黑',
	            fontSize: 35,
	            fontWeight: 'bolder'
	          }
	        },
	        tooltip: {
	          show: true,
	          formatter: "{a} <br/>{b} : {c} ({d}%)"
	        },
	        legend: {
	          orient: 'vertical',
	          x: 300,
	          y: 45,
	          itemGap: 12,
	          data: ['68%Something #1', '29%Something #2', '3%Something #3'],
	        },
	        toolbox: {
	          show: true,
	          feature: {
	            mark: {
	              show: true
	            },
	            dataView: {
	              show: true,
	              title: "Text View",
	              lang: [
	                "Text View",
	                "Close",
	                "Refresh",
	              ],
	              readOnly: false
	            },
	            restore: {
	              show: true,
	              title: "Restore"
	            },
	            saveAsImage: {
	              show: true,
	              title: "Save Image"
	            }
	          }
	        },
	        series: [{
	          name: '1',
	          type: 'pie',
	          clockWise: false,
	          radius: [105, 130],
	          itemStyle: dataStyle,
	          data: [{
	            value: 68,
	            name: '68%Something #1'
	          }, {
	            value: 32,
	            name: 'invisible',
	            itemStyle: placeHolderStyle
	          }]
	        }, {
	          name: '2',
	          type: 'pie',
	          clockWise: false,
	          radius: [80, 105],
	          itemStyle: dataStyle,
	          data: [{
	            value: 29,
	            name: '29%Something #2'
	          }, {
	            value: 71,
	            name: 'invisible',
	            itemStyle: placeHolderStyle
	          }]
	        }, {
	          name: '3',
	          type: 'pie',
	          clockWise: false,
	          radius: [25, 80],
	          itemStyle: dataStyle,
	          data: [{
	            value: 3,
	            name: '3%Something #3'
	          }, {
	            value: 97,
	            name: 'invisible',
	            itemStyle: placeHolderStyle
	          }]
	        }]
	      });    
		</script>
	</body>

</html>