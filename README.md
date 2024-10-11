<h3>mengubah angka desimal ke angka biner</h3>
<p><i>by bayu</i></p>
<p>halo teman teman, hari ini saya akan mengajari cara mengubah angka desimal ke angka biner, secara umum Angka biner atau sistem bilangan biner adalah sebuah sistem penulisan angka yang hanya menggunakan dua simbol, yaitu 0 dan 1. Sistem ini menjadi dasar dari semua sistem bilangan berbasis digital yang kita gunakan saat ini, terutama dalam komputer.</p>

<p>sekarang bagaimana cara untuk mengubah angka desimal ke angka biner? </p>

<p>well, cara nya cukup mudah, coba lihat contoh berikut ini:</p>

<p>10 -> biner? </p>
<table>
  <tr>
    <th>bagi</th>
    <th>hasil bagi</th>
    <th>modulus 2</th>
  </tr>
  <tr>
    <th>10/2</th>
    <th>5</th>
    <th>0</th>
  </tr>
  <tr>
    <th>5/2</th>
    <th>2</th>
    <th>1</th>
  </tr>
  <tr>
    <th>2/2</th>
    <th>1</th>
    <th>0</th>
  </tr>
  <tr>
    <th>1/2</th>
    <th>0</th>
    <th>1</th>
  </tr>
</table>
<p>sekarang kalian hitung dari bawah keatas dan kita akan mendapati angka 1010, biner dari angka desimal 10</p>

<p>cukup mudah bukan? sekarang mari kita terapkan ke java</p>

```java
public class exam{
    public static void main(String[] args){
        int angka = 10;
        long biner = 0;
        
        int convert,i = 1;
        
        while(angka!=0){
            convert = angka%2;
            angka/= 2;
            biner += convert*i;
            i*=10;
            
        }
        System.out.print(biner);
    }
}
```

