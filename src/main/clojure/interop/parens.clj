
(ns interop.parens
  (:gen-class :methods [#^{:static true} [sayHello [] void]
                        #^{:static true} [callThreeTimes [scala.Function1] void]
                        #^{:static true} [putListInBox [interop.Box] void]]))

(defn -sayHello []
  (println "Hello, I'm Clojure :)"))

(defn -callThreeTimes [func]
  (. func apply "First Time")
  (. func apply "Second Time")
  (. func apply "Third Time"))

(defn -putListInBox [box]
  (. box setObject '(a b c d)))
