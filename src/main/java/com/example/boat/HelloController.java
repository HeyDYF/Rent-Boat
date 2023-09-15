package com.example.boat;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloController {

    long WholeTime = 0;
    long WholeTime_Day = 0;
    long WholeTime_Night = 0;
    int WholeCount = 0;
    int WholeCount_Day = 0;
    int WholeCount_Night = 0;
    long WholeMax = 0;
    long WholeMax_Day = 0;
    long WholeMax_Night = 0;


    int ParkFlag = 1;

    public class Boat {
        long Time_Start;
        long Time_End;

        long Time_Total;
        int Condition = 1;
        int numRent = 0;


    }

    Boat CurBoat = new Boat();
    Boat Boat1 = new Boat();

    Boat Boat2 = new Boat();
    Boat Boat3 = new Boat();
    Boat Boat4 = new Boat();

    @FXML
    Label Label_CurTime;
    @FXML
    Label Label_TotalTime;
    //Label_CurTime.Text(dateTimeString);
    Date now = new Date();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String dateTimeString = df.format(now);


    @FXML
    private Label Label_Condition_CurBoat;

    @FXML
    private Label Label_Boat1_Condition;
    @FXML
    private Label Label_Boat2_Condition;
    @FXML
    private Label Label_Boat3_Condition;
    @FXML
    private Label Label_Boat4_Condition;


    @FXML
    private Pane Pane_CurBoat;

    Date date1;
    Date date2;
    Date date3;
    Date date4;
    @FXML
    private Label Label_Num_CurBoat;


    @FXML
    private TextArea text;


    @FXML
    void Button_Start_Click(ActionEvent event) {
        if (ParkFlag == 1) {
            if (CurBoat.Condition == 1) {
                Label_TotalTime.setText("");
                Date now = new Date();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateTimeString = df.format(now);

                Pane_CurBoat.setStyle("-fx-border-color: black; -fx-background-color:#FFD700; -fx-border-width: 5");
                Label_Condition_CurBoat.setText("状态：租用中");
                String str = String.valueOf(CurBoat.numRent);
                Label_Count.setText(str);

                if (CurBoat == Boat1) {
                    CurBoat.Time_Start = now.getTime();
                    date1 = now;
                    Boat1.Time_Start = CurBoat.Time_Start;
                    Pane_Boat_1.setStyle("-fx-border-color: black; -fx-background-color: #FFD700; -fx-border-width: 5");
                    Label_Boat1_Condition.setText("租用中");
                    CurBoat.Condition = Boat1.Condition = 0;
                }
                if (CurBoat == Boat2) {
                    date2 = now;
                    CurBoat.Time_Start = now.getTime();
                    Boat2.Time_Start = CurBoat.Time_Start;
                    Pane_Boat_2.setStyle("-fx-border-color: black; -fx-background-color: #FFD700; -fx-border-width: 5");
                    Label_Boat2_Condition.setText("租用中");
                    CurBoat.Condition = Boat2.Condition = 0;
                }
                if (CurBoat == Boat3) {
                    date3 = now;
                    CurBoat.Time_Start = now.getTime();
                    Boat3.Time_Start = CurBoat.Time_Start;
                    Pane_Boat_3.setStyle("-fx-border-color: black; -fx-background-color: #FFD700; -fx-border-width: 5");
                    Label_Boat3_Condition.setText("租用中");
                    CurBoat.Condition = Boat3.Condition = 0;
                }
                if (CurBoat == Boat4) {
                    date4 = now;
                    CurBoat.Time_Start = now.getTime();
                    Boat4.Time_Start = CurBoat.Time_Start;
                    Pane_Boat_4.setStyle("-fx-border-color: black; -fx-background-color: #FFD700; -fx-border-width: 5");
                    Label_Boat4_Condition.setText("租用中");
                    CurBoat.Condition = Boat4.Condition = 0;

                }
//                text.appendText("租出时间" + dateTimeString + "\n");

                CurBoat.Condition = 0;
                Label_StartTime.setText(dateTimeString);
                Label_EndTime.setText(" ");
            }
        }
    }

    @FXML
    private Label Label_Count;

    @FXML
    void Button_End_Click(ActionEvent event) {
        if (ParkFlag == 1) {
            if (CurBoat.Condition == 0) {

                Date now = new Date();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateTimeString = df.format(now);
                Pane_CurBoat.setStyle("-fx-border-color: black; -fx-background-color:	#2E8B57; -fx-border-width: 5");
                Label_Condition_CurBoat.setText("状态：可租用");
                if (CurBoat == Boat1) {
                    CurBoat.Time_End = now.getTime();
                    Boat1.Time_End = CurBoat.Time_End;
                    Pane_Boat_1.setStyle("-fx-border-color: black; -fx-background-color: 	#2E8B57; -fx-border-width: 5");
                    Label_Boat1_Condition.setText("可租用");
                    CurBoat.Condition = Boat1.Condition = 1;
                    Boat1.Time_Total = Boat1.Time_End - Boat1.Time_Start;


                }
                if (CurBoat == Boat2) {
                    CurBoat.Time_End = now.getTime();
                    Boat2.Time_End = CurBoat.Time_End;
                    Pane_Boat_2.setStyle("-fx-border-color: black; -fx-background-color: 	#2E8B57; -fx-border-width: 5");
                    Label_Boat2_Condition.setText("可租用");
                    CurBoat.Condition = Boat2.Condition = 1;
                    Boat2.Time_Total = Boat2.Time_End - Boat2.Time_Start;


                }
                if (CurBoat == Boat3) {
                    CurBoat.Time_End = now.getTime();
                    Boat3.Time_End = CurBoat.Time_End;
                    Pane_Boat_3.setStyle("-fx-border-color: black; -fx-background-color: 	#2E8B57; -fx-border-width: 5");
                    Label_Boat3_Condition.setText("可租用");
                    CurBoat.Condition = Boat3.Condition = 1;
                    Boat3.Time_Total = Boat3.Time_End - Boat3.Time_Start;

                }
                if (CurBoat == Boat4) {
                    CurBoat.Time_End = now.getTime();
                    Boat4.Time_End = CurBoat.Time_End;
                    Pane_Boat_4.setStyle("-fx-border-color: black; -fx-background-color: 	#2E8B57; -fx-border-width: 5");
                    Label_Boat4_Condition.setText("可租用");
                    CurBoat.Condition = Boat4.Condition = 1;
                    Boat4.Time_Total = Boat4.Time_End - Boat4.Time_Start;

                }
//                text.appendText("归还时间" + dateTimeString + "\n");

                CurBoat.numRent += 1;

                WholeCount += 1;

                if (now.getHours() < 12) {
                    WholeCount_Day += 1;
                }
                if (now.getHours() >= 12) {
                    WholeCount_Night += 1;
                }

                CurBoat.Time_Total = CurBoat.Time_End - CurBoat.Time_Start;
                String str = String.valueOf(Long.valueOf(CurBoat.Time_Total) / 1000);
                String str1 = String.valueOf(Long.valueOf(CurBoat.Time_Total) / 1000 / 60);//分钟
                String str2 = String.valueOf(Long.valueOf(CurBoat.Time_Total) / 1000 % 60);//分钟

                Label_TotalTime.setText(str1 + "分" + str2 + "秒");
//                text.appendText("合计时间：" + str + "秒\n");

                WholeTime += CurBoat.Time_Total;
                if (WholeMax < CurBoat.Time_Total) {
                    WholeMax = CurBoat.Time_Total;

                }
                if (now.getHours() < 12) {
                    WholeTime_Day += CurBoat.Time_Total;
                    if (WholeMax_Day < CurBoat.Time_Total) {
                        WholeMax_Day = CurBoat.Time_Total;
                    }
                }

                if (now.getHours() >= 12) {
                    WholeTime_Night += CurBoat.Time_Total;

                    if (WholeMax_Night < CurBoat.Time_Total) {
                        WholeMax_Night = CurBoat.Time_Total;
                    }
                }

                String str3 = String.valueOf(CurBoat.numRent);
                Label_Count.setText(str3);
                CurBoat.Condition = 1;
                Label_EndTime.setText(dateTimeString);
            }
        }
    }

    @FXML
    private Pane Pane_Boat_1;
    @FXML
    private Pane Pane_Boat_2;
    @FXML
    private Pane Pane_Boat_3;
    @FXML

    private Pane Pane_Boat_4;
    @FXML
    private Label Label_StartTime;
    @FXML
    private Label Label_EndTime;


    @FXML
    void Pane_Boat_1_Click(MouseEvent event) {
        if (ParkFlag == 1) {
            CurBoat = Boat1;
            Label_Num_CurBoat.setText("编号：1号船");

            Pane_CurBoat.setStyle("-fx-border-color: black; -fx-background-color: #4169E1; -fx-border-width: 5");
            Label_Condition_CurBoat.setText("状态：已选中");
            if (CurBoat.Condition == 1) {

                Label_StartTime.setText("");
                Label_EndTime.setText("");
                Label_TotalTime.setText("");

            }
            if (CurBoat.Condition == 0) {
                String Date1 = df.format(date1);
                Label_StartTime.setText(Date1);
                Label_EndTime.setText("");
                Label_TotalTime.setText("");

            }
            String str = String.valueOf(CurBoat.numRent);
            Label_Count.setText(str);
        }
    }

    @FXML
    void Pane_Boat_2_Click(MouseEvent event) {
        if (ParkFlag == 1) {
            CurBoat = Boat2;
            Label_Num_CurBoat.setText("编号：2号船");

            Pane_CurBoat.setStyle("-fx-border-color: black; -fx-background-color: #4169E1; -fx-border-width: 5");
            Label_Condition_CurBoat.setText("状态：已选中");
            if (CurBoat.Condition == 1) {

                Label_StartTime.setText("");
                Label_EndTime.setText("");
                Label_TotalTime.setText("");

            }
            if (CurBoat.Condition == 0) {
                String Date2 = df.format(date2);
                Label_StartTime.setText(Date2);
                Label_EndTime.setText("");
                Label_TotalTime.setText("");

            }
            String str = String.valueOf(CurBoat.numRent);
            Label_Count.setText(str);
        }
    }

    @FXML
    void Pane_Boat_3_Click(MouseEvent event) {
        if (ParkFlag == 1) {
            CurBoat = Boat3;
            Label_Num_CurBoat.setText("编号：3号船");

            Pane_CurBoat.setStyle("-fx-border-color: black; -fx-background-color: #4169E1; -fx-border-width: 5");
            Label_Condition_CurBoat.setText("状态：已选中");
            if (CurBoat.Condition == 1) {

                Label_StartTime.setText("");
                Label_EndTime.setText("");
                Label_TotalTime.setText("");

            }
            if (CurBoat.Condition == 0) {
                String Date3 = df.format(date3);
                Label_StartTime.setText(Date3);
                Label_EndTime.setText("");
                Label_TotalTime.setText("");

            }
            String str = String.valueOf(CurBoat.numRent);
            Label_Count.setText(str);
        }
    }

    @FXML
    void Pane_Boat_4_Click(MouseEvent event) {
        if (ParkFlag == 1) {
            CurBoat = Boat4;
            Label_Num_CurBoat.setText("编号：4号船");

            Pane_CurBoat.setStyle("-fx-border-color: black; -fx-background-color: #4169E1; -fx-border-width: 5");
            Label_Condition_CurBoat.setText("状态：已选中");
            if (CurBoat.Condition == 1) {

                Label_StartTime.setText("");
                Label_EndTime.setText("");
                Label_TotalTime.setText("");
            }
            if (CurBoat.Condition == 0) {
                String Date4 = df.format(date4);
                Label_StartTime.setText(Date4);
                Label_EndTime.setText("");
                Label_TotalTime.setText("");

            }
            String str = String.valueOf(CurBoat.numRent);
            Label_Count.setText(str);
        }
    }

    @FXML
    void getCount_Click(ActionEvent event) {
        if (ParkFlag == 1) {

            String str1 = String.valueOf(WholeCount_Day);
            String str2 = String.valueOf(WholeCount_Night);
            String str3 = String.valueOf(WholeCount);
            text.setText("上午次数：" + str1 + "次\n");
            text.appendText("下午次数：" + str2 + "次\n");
            text.appendText("合计次数：" + str3 + "次\n");
        }
    }

    @FXML
    void getAverageTime_Click(ActionEvent event) {
        if (ParkFlag == 1) {

            if (WholeCount == 0) {
                WholeCount = 1;
            }
            if (WholeCount_Day == 0) {
                WholeCount_Day = 1;
            }
            if (WholeCount_Night == 0) {
                WholeCount_Night = 1;
            }
            String str1 = String.valueOf(Long.valueOf(WholeTime_Day) / 1000 / WholeCount_Day);//上午平均的秒数
            String str2 = String.valueOf(Long.valueOf(WholeTime_Night) / 1000 / WholeCount_Night);//下午平均的秒数
            String str3 = String.valueOf(Long.valueOf(WholeTime) / 1000 / WholeCount);//今日平均的秒数

            String str4 = String.valueOf(Long.valueOf(WholeTime_Day) / 1000 / WholeCount_Day / 60);//上午平均的分钟
            String str5 = String.valueOf(Long.valueOf(WholeTime_Night) / 1000 / WholeCount_Night / 60);//下午平均的分钟
            String str6 = String.valueOf(Long.valueOf(WholeTime) / 1000 / WholeCount / 60);//今日平均的分钟

            String str7 = String.valueOf(Long.valueOf(WholeTime_Day) / 1000 / WholeCount_Day % 60);//上午平均的分钟
            String str8 = String.valueOf(Long.valueOf(WholeTime_Night) / 1000 / WholeCount_Night % 60);//下午平均的分钟
            String str9 = String.valueOf(Long.valueOf(WholeTime) / 1000 / WholeCount % 60);//今日平均的分钟

            text.setText("上午平均时间：" + str4 + "分" + str7 + "秒\n");
            text.appendText("下午平均时间：" + str5 + "分" + str8 + "秒\n");
            text.appendText("今日平均时间：" + str6 + "分" + str9 + "秒\n");
            if (WholeCount == 1) {
                WholeCount = 0;
            }
            if (WholeCount_Day == 1) {
                WholeCount_Day = 0;
            }
            if (WholeCount_Night == 1) {
                WholeCount_Night = 0;
            }
        }
    }

    @FXML
    void getLongestTime_Click(ActionEvent event) {
        if (ParkFlag == 1) {
            String str1 = String.valueOf(Long.valueOf(WholeMax_Day) / 1000 / 60);
            String str2 = String.valueOf(Long.valueOf(WholeMax_Night) / 1000 / 60);
            String str3 = String.valueOf(Long.valueOf(WholeMax) / 1000 / 60);

            String str4 = String.valueOf(Long.valueOf(WholeMax_Day) / 1000 % 60);
            String str5 = String.valueOf(Long.valueOf(WholeMax_Night) / 1000 % 60);
            String str6 = String.valueOf(Long.valueOf(WholeMax) / 1000 % 60);
            text.setText("上午最长时间：" + str1 + "分" + str4 + "秒\n");
            text.appendText("下午最长时间：" + str2 + "分" + str5 + "秒\n");
            text.appendText("今日最长时间：" + str3 + "分" + str6 + "秒\n");
        }
    }

    @FXML
    private Pane BigPane1;
    @FXML
    private Pane BigPane2;
    @FXML
    private Pane BigPane3;

    @FXML
    void ParkClose_Click(ActionEvent event) {
        ParkFlag = 0;
        BigPane1.setOpacity(0.3);
        BigPane2.setOpacity(0.3);
        BigPane3.setOpacity(0.3);
        if (Boat1.Condition == 0) {
            Pane_Boat_1.setStyle("-fx-border-color: black; -fx-background-color: #DC143C; -fx-border-width: 5");
            Label_Boat1_Condition.setText("已丢失");
            Boat1.Condition = -1;
        }
        if (Boat2.Condition == 0) {
            Pane_Boat_2.setStyle("-fx-border-color: black; -fx-background-color:#DC143C; -fx-border-width: 5");
            Label_Boat2_Condition.setText("已丢失");
            Boat2.Condition = -1;

        }
        if (Boat3.Condition == 0) {
            Pane_Boat_3.setStyle("-fx-border-color: black; -fx-background-color:#DC143C; -fx-border-width: 5");
            Label_Boat3_Condition.setText("已丢失");
            Boat3.Condition = -1;

        }
        if (Boat4.Condition == 0) {
            Pane_Boat_4.setStyle("-fx-border-color: black; -fx-background-color:#DC143C; -fx-border-width: 5");
            Label_Boat4_Condition.setText("已丢失");
            Boat4.Condition = -1;

        }
    }

    @FXML
    void ParkOpen_Click(ActionEvent event) {
        ParkFlag = 1;
        BigPane1.setOpacity(1);
        BigPane2.setOpacity(1);
        BigPane3.setOpacity(1);
        Pane_CurBoat.setStyle("-fx-border-color: black; -fx-background-color:Grey; -fx-border-width: 5");
        Label_Num_CurBoat.setText("请选择船只");
        Label_Condition_CurBoat.setText("当前不可用");
        Label_StartTime.setText("");
        Label_EndTime.setText("");
        Label_TotalTime.setText("");
        Label_Count.setText("");
        Boat1.numRent = 0;
        Boat2.numRent = 0;
        Boat3.numRent = 0;
        Boat4.numRent = 0;
        WholeCount = 0;
        WholeCount_Day = 0;
        WholeCount_Night = 0;
        WholeTime = 0;
        WholeTime_Day = 0;
        WholeTime_Night = 0;
        WholeMax = 0;
        WholeMax_Day = 0;
        WholeMax_Night = 0;
        text.setText("");

        if (Boat1.Condition == -1) {
            Pane_Boat_1.setStyle("-fx-border-color: black; -fx-background-color:	#2E8B57; -fx-border-width: 5");
            Label_Boat1_Condition.setText("可租用");
            Boat1.Condition = 1;
        }
        if (Boat2.Condition == -1) {
            Pane_Boat_2.setStyle("-fx-border-color: black; -fx-background-color:	#2E8B57; -fx-border-width: 5");
            Label_Boat2_Condition.setText("可租用");
            Boat2.Condition = 1;
        }
        if (Boat3.Condition == -1) {
            Pane_Boat_3.setStyle("-fx-border-color: black; -fx-background-color:	#2E8B57; -fx-border-width: 5");
            Label_Boat3_Condition.setText("可租用");
            Boat3.Condition = 1;
        }
        if (Boat4.Condition == -1) {
            Pane_Boat_4.setStyle("-fx-border-color: black; -fx-background-color:	#2E8B57; -fx-border-width: 5");
            Label_Boat4_Condition.setText("可租用");
            Boat4.Condition = 1;
        }
    }

    @FXML
    void ProVersion_Click(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION); // 创建一个消息对话框
        alert.setHeaderText("【高级版】尚未解锁"); // 设置对话框的头部文本
        alert.show(); // 显示对话框
        alert.setContentText("更多高级功能正在开发中，敬请期待！");
        alert.show();
    }
}