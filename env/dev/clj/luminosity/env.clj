(ns luminosity.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [luminosity.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[luminosity started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[luminosity has shut down successfully]=-"))
   :middleware wrap-dev})
