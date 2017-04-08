
;; Using the :gen-class option, we request that Clojure make a class containing all of the specified
;; methods. Note that the methods are marked with the static flag.
(ns interop.parens
  (:gen-class :methods [#^{:static true} [sayHello [] void]
                        #^{:static true} [callThreeTimes [scala.Function1] void]
                        #^{:static true} [putListInBox [interop.Box] void]]))

;; This will translate directly to a JVM method which can be called from Java or Scala.
(defn -sayHello []
  (println "Hello, I'm Clojure :)"))

;; The scala.Function1 class can be used seamlessly in Clojure, allowing first-class functions
;; to be passed between the languages.
(defn -callThreeTimes [func]
  (. func apply "First Time")
  (. func apply "Second Time")
  (. func apply "Third Time"))

;; The interop.Box instance created in the Java code can be manipulated here, and we can place
;; a Clojure list inside of it.
(defn -putListInBox [box]
  (. box setObject '(a b c d)))
