/* Generated By:JavaCC: Do not edit this line. EG1TokenManager.java */
import data.*;
//import data.strips.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Hashtable;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Token Manager. */
public class EG1TokenManager implements EG1Constants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x8000L) != 0L)
            return 5;
         if ((active0 & 0xc204180L) != 0L)
         {
            jjmatchedKind = 29;
            return 5;
         }
         return -1;
      case 1:
         if ((active0 & 0xc204180L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
            return 5;
         }
         return -1;
      case 2:
         if ((active0 & 0xc000000L) != 0L)
            return 5;
         if ((active0 & 0x204180L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 2;
            return 5;
         }
         return -1;
      case 3:
         if ((active0 & 0x204180L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 3;
            return 5;
         }
         return -1;
      case 4:
         if ((active0 & 0x204180L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 4;
            return 5;
         }
         return -1;
      case 5:
         if ((active0 & 0x204000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 5;
            return 5;
         }
         if ((active0 & 0x180L) != 0L)
            return 5;
         return -1;
      case 6:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 6;
            return 5;
         }
         if ((active0 & 0x4000L) != 0L)
            return 5;
         return -1;
      case 7:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 7;
            return 5;
         }
         return -1;
      case 8:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 8;
            return 5;
         }
         return -1;
      case 9:
         if ((active0 & 0x200000L) != 0L)
            return 5;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 5);
      case 41:
         return jjStopAtPos(0, 6);
      case 45:
         return jjStartNfaWithStates_0(0, 15, 5);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x3de3e00L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x180L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x204000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x400080L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x8800100L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0xc2000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x204400L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 68:
      case 100:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 5);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x200400L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x400080L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x1104200L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x82000L);
      case 84:
      case 116:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 5);
         break;
      case 89:
      case 121:
         return jjMoveStringLiteralDfa3_0(active0, 0x1800L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000100L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x82000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa4_0(active0, 0x600000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000080L);
      case 74:
      case 106:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x1800L);
      case 81:
      case 113:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x40200L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0xe01000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x20900L);
      case 76:
      case 108:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(4, 24);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 84:
      case 116:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(4, 25);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0xc00000L);
      case 69:
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 5);
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x2600L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 78:
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 5);
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0xa0000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      case 83:
      case 115:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(5, 12);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x240000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 77:
      case 109:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(6, 14, 5);
         break;
      case 78:
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(6, 9);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(6, 17);
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x100400L);
      case 84:
      case 116:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(6, 22);
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x102000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000L);
      case 83:
      case 115:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(7, 23);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 58:
         return jjMoveStringLiteralDfa9_0(active0, 0x800L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa9_0(active0, 0x200000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x180000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa9_0(active0, 0x400L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa10_0(active0, 0x800L);
      case 69:
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(9, 21, 5);
         return jjMoveStringLiteralDfa10_0(active0, 0x2400L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa10_0(active0, 0x100000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x80000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x400L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa11_0(active0, 0x800L);
      case 83:
      case 115:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(10, 13);
         else if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(10, 18);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa11_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         return jjMoveStringLiteralDfa12_0(active0, 0x800L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa12_0(active0, 0x80000L);
      case 83:
      case 115:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(11, 20);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa12_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(12, 19);
         break;
      case 83:
      case 115:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(12, 10);
         return jjMoveStringLiteralDfa13_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 84:
      case 116:
         return jjMoveStringLiteralDfa14_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 82:
      case 114:
         return jjMoveStringLiteralDfa15_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa16_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa17_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         return jjMoveStringLiteralDfa18_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
private int jjMoveStringLiteralDfa18_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(16, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, active0);
      return 18;
   }
   switch(curChar)
   {
      case 84:
      case 116:
         return jjMoveStringLiteralDfa19_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(17, active0);
}
private int jjMoveStringLiteralDfa19_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(17, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(18, active0);
      return 19;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         return jjMoveStringLiteralDfa20_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(18, active0);
}
private int jjMoveStringLiteralDfa20_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(18, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(19, active0);
      return 20;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa21_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(19, active0);
}
private int jjMoveStringLiteralDfa21_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(19, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(20, active0);
      return 21;
   }
   switch(curChar)
   {
      case 58:
         return jjMoveStringLiteralDfa22_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(20, active0);
}
private int jjMoveStringLiteralDfa22_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(20, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(21, active0);
      return 22;
   }
   switch(curChar)
   {
      case 80:
      case 112:
         return jjMoveStringLiteralDfa23_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(21, active0);
}
private int jjMoveStringLiteralDfa23_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(21, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(22, active0);
      return 23;
   }
   switch(curChar)
   {
      case 82:
      case 114:
         return jjMoveStringLiteralDfa24_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(22, active0);
}
private int jjMoveStringLiteralDfa24_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(22, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(23, active0);
      return 24;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa25_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(23, active0);
}
private int jjMoveStringLiteralDfa25_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(23, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(24, active0);
      return 25;
   }
   switch(curChar)
   {
      case 70:
      case 102:
         return jjMoveStringLiteralDfa26_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(24, active0);
}
private int jjMoveStringLiteralDfa26_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(24, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(25, active0);
      return 26;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa27_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(25, active0);
}
private int jjMoveStringLiteralDfa27_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(25, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(26, active0);
      return 27;
   }
   switch(curChar)
   {
      case 82:
      case 114:
         return jjMoveStringLiteralDfa28_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(26, active0);
}
private int jjMoveStringLiteralDfa28_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(26, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(27, active0);
      return 28;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa29_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(27, active0);
}
private int jjMoveStringLiteralDfa29_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(27, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(28, active0);
      return 29;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         return jjMoveStringLiteralDfa30_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(28, active0);
}
private int jjMoveStringLiteralDfa30_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(28, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(29, active0);
      return 30;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa31_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(29, active0);
}
private int jjMoveStringLiteralDfa31_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(29, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(30, active0);
      return 31;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa32_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(30, active0);
}
private int jjMoveStringLiteralDfa32_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(30, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(31, active0);
      return 32;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(32, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(31, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 12;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff200000000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAdd(5);
                  }
                  else if (curChar == 59)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 63)
                     jjCheckNAdd(1);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                     jjCheckNAddTwoStates(2, 3);
                  }
                  break;
               case 1:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAddTwoStates(2, 3);
                  break;
               case 3:
                  if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(4);
                  break;
               case 5:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(5);
                  break;
               case 6:
                  if (curChar == 59)
                     jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 8:
                  if ((0x2400L & l) != 0L && kind > 30)
                     kind = 30;
                  break;
               case 9:
                  if (curChar == 10 && kind > 30)
                     kind = 30;
                  break;
               case 10:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 59)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(5);
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 7:
                  jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 7:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 12 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   7, 8, 10, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\50", "\51", null, null, null, null, null, null, 
null, null, "\55", null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3fffffe1L, 
};
static final long[] jjtoSkip = {
   0x4000001eL, 
};
static final long[] jjtoSpecial = {
   0x40000000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[12];
private final int[] jjstateSet = new int[24];
protected char curChar;
/** Constructor. */
public EG1TokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public EG1TokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 12; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
