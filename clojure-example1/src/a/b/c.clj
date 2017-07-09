(ns a.b.c)
(ns str
  (:use [clojure.string]))

;(ns io (:use [clojure.java.io]))

(require '[clojure.java.io :as io])


(defn hello-world [username]
  (println (format "Hello, %s" username))
  )

;(def data-file (resource "f://tmp//a1.txt"))
;(slurp data-file)

(def str2 (str "abc" "/ABC/" "/456"))
(def str1 (str "abc" "/123/" str2))
(hello-world str1)


; You can call java methods such as File/exists
(if (.exists (io/as-file "dummy.txt"))(println "Y")(println "N"))
(if (> 5 2)(println "YES")(println "NO"))


;;file函数，获取一个java.io.File对象
;(def f (file "f://tmp//a1.txt"))

;;拷贝文件使用copy
;(copy f (file "f://tmp//b1.txt"))

;;删除文件，使用delete-file
;(delete-file f)

;;更经常使用reader和writer
;(def rdr (reader "b.txt" :encoding "utf-8"))
;(def wtr (writer "c.txt" :append true))

;;copy可以接受多种类型的参数
;(copy rdr wtr :buffer-size 4096)

;;关闭文件
;(.close wtr)
;(.close rdr)

