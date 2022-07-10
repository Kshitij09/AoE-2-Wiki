import SwiftUI
import core
import RxSwift
import KMPNativeCoroutinesRxSwift

struct ContentView: View {
	let greeting = Greeting()
    
    @State var greet = "Loading"
    
    func load() -> Disposable {
        let htmlSingle = createSingle(for: greeting.getHtmlNative())
        return htmlSingle.subscribe(onSuccess: { result in
                self.greet = result
            }, onFailure: { error in
                self.greet = "Error: \(error)"
            }, onDisposed: {
                print("getHtml disposed")
            })
    }
    
	var body: some View {
        var greetHandle: Disposable? = nil
        Text(greet).onAppear() {
            greetHandle = load()
        }.onDisappear() {
            greetHandle?.dispose()
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
