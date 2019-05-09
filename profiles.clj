{:user {:plugins  [[alembic "0.3.2"]
                   [cider/cider-nrepl "0.21.1"]
                   [jonase/eastwood "0.2.5"]
                   [lein-ancient "0.6.15"]
                   [lein-bikeshed "0.5.1"]
                   [lein-kibit "0.1.6-beta2"]
                   [lein-midje "3.2.1"]
                   [lein-nsorg "0.2.0"]
                   [lein-pprint "1.1.1"]
                   [venantius/yagni "0.1.4"]
                   ]
        :dependencies [
                       [slamhound "1.3.1"]
                       [org.clojure/tools.nrepl "0.2.13"]
                       [org.clojure/tools.trace "0.7.10"]
                      ]
        :bikeshed {:max-line-length 120
                   :docstrings      false}}}
