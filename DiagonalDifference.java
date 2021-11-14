{\rtf1\ansi\ansicpg1252\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue254;\red0\green0\blue0;
\red22\green107\blue41;\red144\green1\blue18;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c99608;\cssrgb\c0\c0\c0;
\cssrgb\c7451\c48627\c21176;\cssrgb\c63922\c8235\c8235;}
\paperw11900\paperh16840\margl1440\margr1440\vieww28600\viewh17440\viewkind0
\deftab720
\pard\pardeftab720\sl460\partightenfactor0

\f0\fs30 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf4 \strokec4 \'a0java.io.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0java.math.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0java.security.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0java.text.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0java.util.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0java.util.concurrent.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0java.util.function.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0java.util.regex.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0java.util.stream.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0\cf2 \strokec2 static\cf4 \strokec4 \'a0java.util.stream.Collectors.joining;\cb1 \
\cf2 \cb3 \strokec2 import\cf4 \strokec4 \'a0\cf2 \strokec2 static\cf4 \strokec4 \'a0java.util.stream.Collectors.toList;\cb1 \
\
\cf2 \cb3 \strokec2 class\cf4 \strokec4 \'a0Result\'a0\{\cb1 \
\
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \cb3 \'a0\'a0\'a0\'a0\cf5 \strokec5 /*\cf4 \cb1 \strokec4 \
\pard\pardeftab720\sl460\partightenfactor0
\cf5 \cb3 \strokec5 \'a0\'a0\'a0\'a0\'a0*\'a0Complete\'a0the\'a0'diagonalDifference'\'a0function\'a0below.\cf4 \cb1 \strokec4 \
\cf5 \cb3 \strokec5 \'a0\'a0\'a0\'a0\'a0*\cf4 \cb1 \strokec4 \
\cf5 \cb3 \strokec5 \'a0\'a0\'a0\'a0\'a0*\'a0The\'a0function\'a0is\'a0expected\'a0to\'a0return\'a0an\'a0INTEGER.\cf4 \cb1 \strokec4 \
\cf5 \cb3 \strokec5 \'a0\'a0\'a0\'a0\'a0*\'a0The\'a0function\'a0accepts\'a02D_INTEGER_ARRAY\'a0arr\'a0as\'a0parameter.\cf4 \cb1 \strokec4 \
\cf5 \cb3 \strokec5 \'a0\'a0\'a0\'a0\'a0*/\cf4 \cb1 \strokec4 \
\
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 static\cf4 \strokec4 \'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0diagonalDifference(List<List<Integer>>\'a0arr)\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0sumDiag1\'a0=\'a0\cf5 \strokec5 0\cf4 \strokec4 ,\'a0sumDiag2\'a0=\'a0\cf5 \strokec5 0\cf4 \strokec4 ,\'a0n\'a0=\'a0arr.size();\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4 \'a0i=\cf5 \strokec5 0\cf4 \strokec4 ;\'a0i<n;\'a0i++)\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4 \'a0j=\cf5 \strokec5 0\cf4 \strokec4 ;\'a0j<n;\'a0j++)\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 (j==i)\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0sumDiag1\'a0+=\'a0arr.get(i).get(j);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf4 \strokec4 ((i+j)\'a0==\'a0(n-\cf5 \strokec5 1\cf4 \strokec4 ))\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0sumDiag2\'a0+=\'a0arr.get(i).get(j);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 return\cf4 \strokec4 \'a0Math.abs(sumDiag2-sumDiag1);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\
\cb3 \}\cb1 \
\
\pard\pardeftab720\sl460\partightenfactor0
\cf2 \cb3 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 class\cf4 \strokec4 \'a0Solution\'a0\{\cb1 \
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf4 \strokec4 \'a0\cf2 \strokec2 static\cf4 \strokec4 \'a0\cf2 \strokec2 void\cf4 \strokec4 \'a0main(String[]\'a0args)\'a0\cf2 \strokec2 throws\cf4 \strokec4 \'a0IOException\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0BufferedReader\'a0bufferedReader\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0BufferedReader(\cf2 \strokec2 new\cf4 \strokec4 \'a0InputStreamReader(System.in));\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0BufferedWriter\'a0bufferedWriter\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0BufferedWriter(\cf2 \strokec2 new\cf4 \strokec4 \'a0FileWriter(System.getenv(\cf6 \strokec6 "OUTPUT_PATH"\cf4 \strokec4 )));\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0n\'a0=\'a0Integer.parseInt(bufferedReader.readLine().trim());\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0List<List<Integer>>\'a0arr\'a0=\'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0ArrayList<>();\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0IntStream.range(\cf5 \strokec5 0\cf4 \strokec4 ,\'a0n).forEach(i\'a0->\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 try\cf4 \strokec4 \'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0arr.add(\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Stream.of(bufferedReader.readLine().replaceAll(\cf6 \strokec6 "\\\\s+$"\cf4 \strokec4 ,\'a0\cf6 \strokec6 ""\cf4 \strokec4 ).split(\cf6 \strokec6 "\'a0"\cf4 \strokec4 ))\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0.map(Integer::parseInt)\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0.collect(toList())\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\'a0\cf2 \strokec2 catch\cf4 \strokec4 \'a0(IOException\'a0ex)\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 throw\cf4 \strokec4 \'a0\cf2 \strokec2 new\cf4 \strokec4 \'a0RuntimeException(ex);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\});\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf4 \strokec4 \'a0result\'a0=\'a0Result.diagonalDifference(arr);\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bufferedWriter.write(String.valueOf(result));\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bufferedWriter.newLine();\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bufferedReader.close();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bufferedWriter.close();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \}\cb1 \
\
}