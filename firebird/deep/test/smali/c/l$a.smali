.class public Lc/l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le0/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lc/l;


# direct methods
.method public constructor <init>(Lc/l;)V
    .locals 0

    iput-object p1, p0, Lc/l$a;->b:Lc/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public h(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lc/l$a;->b:Lc/l;

    invoke-virtual {v0, p1}, Lc/l;->b(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
